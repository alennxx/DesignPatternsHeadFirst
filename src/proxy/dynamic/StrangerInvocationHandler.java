package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StrangerInvocationHandler implements InvocationHandler {

    private final PersonComponent person;

    public StrangerInvocationHandler(PersonComponent person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.startsWith("get") || methodName.equals("setBeautyRank")) {
            return method.invoke(person, args);
        } else {
            throw new IllegalAccessException();
        }
    }
}
