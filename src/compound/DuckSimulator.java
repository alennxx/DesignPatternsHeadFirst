package compound;

import java.util.stream.IntStream;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactoryWithCounter();
        simulator.launch(duckFactory);
    }

    void launch(AbstractDuckFactory duckFactory) {
        Flock wildDuckFlock = createFlockOfWildDucks(duckFactory, 4);
        Flock duckFlock = createFlockOfDucks(duckFactory);
        duckFlock.add(wildDuckFlock); //composite pattern

        System.out.println("Duck Simulator\n");

        System.out.println("Whole flock:");
        activate(duckFlock);

        System.out.println("\nFlock of wild ducks:");
        activate(wildDuckFlock);

        System.out.println("\nNumber of quacks: " + QuackCounter.getNumberOfQuacks());
        //536
    }

    private Flock createFlockOfDucks(AbstractDuckFactory duckFactory) {
        Flock flock = new Flock();
        flock.add(duckFactory.createShovelerDuck()); //factory pattern
        flock.add(duckFactory.createDecoyDuck());
        flock.add(duckFactory.createRubberDuck());
        flock.add(new GooseAdapter(new Goose())); //adapter pattern
        return flock;
    }

    private Flock createFlockOfWildDucks(AbstractDuckFactory duckFactory, int numberOfDucks) {
        Flock flock = new Flock();
        IntStream.range(0, numberOfDucks).mapToObj(i -> duckFactory.createWildDuck()).forEach(flock::add);
        return flock;
    }

    void activate(Quacking duck) {
        duck.quack();
    }

}
