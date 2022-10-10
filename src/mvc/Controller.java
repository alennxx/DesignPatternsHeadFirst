package mvc;

public interface Controller {

    void start();

    void stop();

    void setBPM(int bpm);

    void increaseBPM();

    void decreaseBPM();

}
