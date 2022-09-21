package facade;

abstract class Appliance {
    private final String name;

    protected Appliance(String name) {
        this.name = name;
    }

    public final void turnOn() {
        System.out.println(name + " is turned on");
    }

    public final void turnOff() {
        System.out.println(name + " is turned off");
    }
}
