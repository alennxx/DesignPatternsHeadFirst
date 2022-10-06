package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.function.Function;

public class DatingService {

    public static void main(String[] args) {
        PersonComponent p1 = new PersonComponentImpl("P 1", "M", "Sport");

        PersonComponent owner = getOwnerProxy(p1);
        System.out.println("Owner - get name: " + owner.getName());
        owner.setHobby("Cooking");
        System.out.println("Owner has set hobby");

        try {
            owner.setBeautyRank(9);
            System.out.println("Owner has set beauty rank");
        } catch (Exception e) {
            System.out.println("Owner has NOT set beauty rank");
        }

        PersonComponent stranger = getStrangerProxy(p1);
        System.out.println("Stranger - get name: " + stranger.getName());
        try {
            stranger.setHobby("Music");
            System.out.println("Stranger has set hobby");
        } catch (Exception e) {
            System.out.println("Stranger has NOT set hobby");
        }
        stranger.setBeautyRank(3);
        System.out.println("Stranger has set beauty rank");
    }

    private static PersonComponent getOwnerProxy(PersonComponent person) {
        return getInvocationHandler(person, OwnerInvocationHandler::new);
    }

    private static PersonComponent getStrangerProxy(PersonComponent person) {
        return getInvocationHandler(person, StrangerInvocationHandler::new);
    }

    private static PersonComponent getInvocationHandler(PersonComponent person, Function<PersonComponent, InvocationHandler> invocationHandlerCons) {
        return (PersonComponent) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), invocationHandlerCons.apply(person));
    }

}
