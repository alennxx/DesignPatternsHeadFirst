package mvc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DJView implements ActionListener, BeatObserver, BPMObserver {

    private final BeatModel model;
    private final Controller controller;

    private JFrame frameView;
    private JPanel panelView;
    private BeatBar beatBar;
    private JLabel bpmOutputLabel;

    public DJView(BeatModel model, Controller controller) {
        this.model = model;
        this.controller = controller;
        model.registerObserver((BPMObserver) this);
        model.registerObserver((BeatObserver) this);
    }

    public void createView() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void updateBPM() {
        int bpm = model.getBPM();
        if (bpm == 0) {
            bpmOutputLabel.setText("offline");
        } else {
            bpmOutputLabel.setText("Current BPM value: " + bpm);
        }
    }

    @Override
    public void updateBeat() {
        beatBar.setValue(100);
    }

    //559

}
