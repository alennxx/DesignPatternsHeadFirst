package proxy.example;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImpl extends UnicastRemoteObject implements Remote {

    public RemoteImpl() throws RemoteException {
        //NOP
    }

    public static void main(String[] args) {
        try {
            Remote remote = new RemoteImpl();
            Naming.rebind("RemoteHi", remote);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String sayHi() throws RemoteException {
        return "Server says 'Hi'.";
    }

}
