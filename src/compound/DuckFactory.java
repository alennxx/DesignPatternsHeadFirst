package compound;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quacking createWildDuck() {
        return new WildDuck();
    }

    @Override
    public Quacking createShovelerDuck() {
        return new ShovelerDuck();
    }

    @Override
    public Quacking createDecoyDuck() {
        return new DecoyDuck();
    }

    @Override
    public Quacking createRubberDuck() {
        return new RubberDuck();
    }
}
