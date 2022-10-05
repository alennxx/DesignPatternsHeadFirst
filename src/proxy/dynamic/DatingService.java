package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.function.Function;

public class DatingService {

    public static void main(String[] args) {
        PersonComponent p1 = new PersonComponentImpl("P 1", "M", "Sport");
        PersonComponent owner = getOwnerProxy(p1);
        PersonComponent stranger = getStrangerProxy(p1);

        System.out.println("Owner - get name: " + owner.getName());
        //502
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
