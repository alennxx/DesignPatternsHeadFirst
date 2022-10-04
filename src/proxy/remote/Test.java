package proxy.remote;

import java.rmi.Naming;

public class Test {

    public static void main(String[] args) {
        try {
            RemoteVendingMachine machine = (RemoteVendingMachine) Naming.lookup("rmi://127.0.0.1/Berlin/vendingMachine");
            VendingMachineMonitor monitor = new VendingMachineMonitor(machine);
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
