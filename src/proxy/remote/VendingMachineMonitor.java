package proxy.remote;

import java.rmi.RemoteException;

public class VendingMachineMonitor {

    private final RemoteVendingMachine vendingMachine;

    public VendingMachineMonitor(RemoteVendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void report() {
        try {
            System.out.println("Vending Machine: " + vendingMachine.getLocation());
            System.out.println("Items: " + vendingMachine.getNumberOfItems() + " pcs");
            System.out.println();
        } catch (RemoteException exception) {
            exception.printStackTrace();
        }
    }

}
