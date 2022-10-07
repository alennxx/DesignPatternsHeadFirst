package compound;

public class DuckFactoryWithCounter extends AbstractDuckFactory {

    @Override
    public Quacking createWildDuck() {
        return new QuackCounter(new WildDuck()); //decorator pattern
    }

    @Override
    public Quacking createShovelerDuck() {
        return new QuackCounter(new ShovelerDuck()); //decorator pattern
    }

    @Override
    public Quacking createDecoyDuck() {
        return new QuackCounter(new DecoyDuck()); //decorator pattern
    }

    @Override
    public Quacking createRubberDuck() {
        return new QuackCounter(new RubberDuck()); //decorator pattern
    }

}
