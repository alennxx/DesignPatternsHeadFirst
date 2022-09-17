package command.model;

public class GarageGate {

    private boolean isOpened = false;

    public void open() {
        //garage gate can be "partially" opened to start opening again
        isOpened = true;
        System.out.println("Garage gate is open");
    }

    public void close() {
        if (isOpened) {
            isOpened = false;
            System.out.println("Garage gate is closed");
        }
    }

}
