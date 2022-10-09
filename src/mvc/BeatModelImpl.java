package mvc;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

public class BeatModelImpl implements BeatModel, MetaEventListener {

    private final List<BeatObserver> beatObservers = new ArrayList<>();
    private final List<BPMObserver> bpmObservers = new ArrayList<>();
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;
    private int bpm = 90;

    @Override
    public void meta(MetaMessage meta) {
        if (meta.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }

    @Override
    public void initialize() {
        configureMidi();
        buildTrackAndStart();
    }

    @Override
    public void start() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void stop() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(bpm);
        notifyBPMObservers();
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

    public void beatEvent() {
        notifyBeatObservers();
    }

    private void notifyBeatObservers() {
        beatObservers.forEach(BeatObserver::updateBeat);
    }

    private void notifyBPMObservers() {
        bpmObservers.forEach(BPMObserver::updateBPM);
    }

    private void configureMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};
        sequence.deleteTrack(null);
        track = sequence.createTrack();
        buildTracks(trackList);
        track.add(buildMidiEvent(192, 9, 1, 0, 4));
        try {
            sequencer.setSequence(sequence);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void buildTracks(int[] trackList) {
        for (int i = 0; i < trackList.length; i++) {
            int key = trackList[i];
            if (key != 0) {
                track.add(buildMidiEvent(144, 9, key, 100, i));
                track.add(buildMidiEvent(128, 9, key, 100, i + 1));
            }
        }
    }

    private MidiEvent buildMidiEvent(int command, int channel, int data1, int data2, int time) {
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(command, channel, data1, data2);
            return new MidiEvent(message, time);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

}
