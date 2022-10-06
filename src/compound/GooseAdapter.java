package compound;

public class GooseAdapter implements Quacking {

    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.gaggle();
    }
}
