package mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HeartModel implements Heart {

    private final List<BeatObserver> beatObservers;
    private final List<BPMObserver> bpmObservers;
    private final Random random;

    public HeartModel() {
        beatObservers = new ArrayList<>();
        bpmObservers = new ArrayList<>();
        random = new Random();
    }

    @Override
    public int getHeartRate() {
        return random.nextInt(50, 200);
    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        beatObservers.add(beatObserver);
    }

    @Override
    public void removeObserver(BeatObserver beatObserver) {
        beatObservers.remove(beatObserver);
    }

    @Override
    public void registerObserver(BPMObserver bpmObserver) {
        bpmObservers.add(bpmObserver);
    }

    @Override
    public void removeObserver(BPMObserver bpmObserver) {
        bpmObservers.remove(bpmObserver);
    }

}
