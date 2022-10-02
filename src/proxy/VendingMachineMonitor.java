package proxy;

public class VendingMachineMonitor {

    private final VendingMachine vendingMachine;

    public VendingMachineMonitor(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void report() {
        System.out.println("Vending Machine: " + vendingMachine.getLocation());
        System.out.println("Items: " + vendingMachine.getNumberOfItems() + " pcs");
        System.out.println();
    }

}
