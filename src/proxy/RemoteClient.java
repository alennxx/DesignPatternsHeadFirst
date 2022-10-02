package proxy;

import java.rmi.Naming;

public class RemoteClient {

    public static void main(String[] args) {
        //467
    }

    public void go() {
        try {
            Remote service = (Remote) Naming.lookup("rmi://127.0.0.1/RemoteHi");
            String result = service.sayHi();
            System.out.println(result);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
