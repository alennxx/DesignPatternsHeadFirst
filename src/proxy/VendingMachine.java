package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class VendingMachine extends UnicastRemoteObject implements RemoteVendingMachine {

    private final String location;
    private final int numberOfItems;

    public VendingMachine(String location, int numberOfItems) throws RemoteException {
        this.location = location;
        this.numberOfItems = numberOfItems;
    }

    public static void main(String[] args) {
        try {
            RemoteVendingMachine vendingMachine = new VendingMachine("Berlin", 235);
            Naming.rebind("//" + vendingMachine.getLocation() + "/vendingMachine", vendingMachine);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public int getNumberOfItems() {
        return numberOfItems;
    }

}
