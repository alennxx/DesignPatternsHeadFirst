package mvc;

public interface Heart {

    int getHeartRate();

    void registerObserver(BeatObserver beatObserver);

    void removeObserver(BeatObserver beatObserver);

    void registerObserver(BPMObserver bpmObserver);

    void removeObserver(BPMObserver bpmObserver);

}
