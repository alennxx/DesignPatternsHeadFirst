package compound;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quacking {

    private final List<Quacking> birds = new ArrayList<>();

    public void add(Quacking bird) {
        birds.add(bird);
    }

    @Override
    public void quack() {
        birds.forEach(Quacking::quack);
    }
}
