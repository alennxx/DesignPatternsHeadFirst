package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteVendingMachine extends Remote {
    int getNumberOfItems() throws RemoteException;

    String getLocation() throws RemoteException;
}
