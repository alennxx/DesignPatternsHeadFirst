package proxy.example;

import java.rmi.RemoteException;

public interface Remote extends java.rmi.Remote {

    String sayHi() throws RemoteException;

}
