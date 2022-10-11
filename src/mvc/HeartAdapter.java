package mvc;

public class HeartAdapter implements Model {

    private final Heart heart;

    public HeartAdapter(Heart heart) {
        this.heart = heart;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        heart.registerObserver(beatObserver);
    }

    @Override
    public void removeObserver(BeatObserver beatObserver) {
        heart.removeObserver(beatObserver);
    }

    @Override
    public void registerObserver(BPMObserver bpmObserver) {
        heart.registerObserver(bpmObserver);
    }

    @Override
    public void removeObserver(BPMObserver bpmObserver) {
        heart.removeObserver(bpmObserver);
    }
}
