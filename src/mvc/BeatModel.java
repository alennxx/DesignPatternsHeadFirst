package mvc;

public interface BeatModel {

    void initialize();

    void start();

    void stop();

    int getBPM();

    void setBPM(int bpm);

    void registerObserver(BeatObserver beatObserver);

    void removeObserver(BeatObserver beatObserver);

    void registerObserver(BPMObserver bpmObserver);

    void removeObserver(BPMObserver bpmObserver);

}
