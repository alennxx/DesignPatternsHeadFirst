package compound;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.launch();
    }

    void launch() {
        Quacking wild = new QuackCounter(new WildDuck()); //QuackCounter = decorator pattern
        Quacking shoveler = new QuackCounter(new ShovelerDuck());
        Quacking decoy = new QuackCounter(new DecoyDuck());
        Quacking rubber = new QuackCounter(new RubberDuck());
        Quacking gooseDuck = new GooseAdapter(new Goose()); //GooseAdapter = adapter pattern

        System.out.println("Duck Simulator");

        activate(wild);
        activate(shoveler);
        activate(decoy);
        activate(rubber);
        activate(gooseDuck);

        System.out.println("\nNumber of quacks: " + QuackCounter.getNumberOfQuacks());
        //525
    }

    void activate(Quacking duck) {
        duck.quack();
    }

}
