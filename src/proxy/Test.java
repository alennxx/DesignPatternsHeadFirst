package proxy;

public class Test {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine("Berlin", 231);
        VendingMachineMonitor monitor = new VendingMachineMonitor(machine);

        monitor.report();
        //
    }

}
