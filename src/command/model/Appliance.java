package command.model;

abstract class Appliance {

    private final String name;
    private boolean turnedOn = false;

    protected Appliance(String name) {
        this.name = name;
    }

    public void turnOn() {
        if (!turnedOn) {
            turnedOn = true;
            System.out.println(name + " is turned on");
        }
    }

    public void turnOff() {
        if (turnedOn) {
            turnedOn = false;
            System.out.println(name + " is turned off");
        }
    }

}
