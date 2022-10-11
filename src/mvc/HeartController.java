package mvc;

public class HeartController implements Controller {

    private final Heart heart;
    private final DJView view;

    public HeartController(Heart heart) {
        this.heart = heart;
        view = new DJView(new HeartAdapter(heart), this);
        view.createView();
        view.createControls();
        view.disableStartMenuItem();
        view.disableStopMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }
}
