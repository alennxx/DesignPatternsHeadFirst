package mvc;

public interface BeatModel {

    void initialize();

    void start();

    void stop();

    int getBPM();

    void setBPM(int bpm);

    void registerObserver(BeatObserver beatObserver);

    void removeObserver(BeatObserver beatObserver);
    //555

}
