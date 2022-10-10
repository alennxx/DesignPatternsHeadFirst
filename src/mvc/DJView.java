package mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DJView implements ActionListener, BeatObserver, BPMObserver {

    private final Model model;
    private final Controller controller;

    private JFrame frameView;
    private JPanel panelView;
    private BeatBar beatBar;
    private JLabel bpmOutputLabel;

    //user controls:
    private JFrame controlsFrame;
    private JPanel controlsPanel;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem startMenuItem;
    private JMenuItem stopMenuItem;
    private JLabel bpmLabel;
    private JTextField bpmTextField;
    private JButton setBpmButton;
    private JButton increaseBpmButton;
    private JButton decreaseBpmButton;


    public DJView(Model model, Controller controller) {
        this.model = model;
        this.controller = controller;
        model.registerObserver((BPMObserver) this);
        model.registerObserver((BeatObserver) this);
    }

    public void createView() {
        panelView = new JPanel(new GridLayout(1, 2));
        frameView = new JFrame("View");
        frameView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameView.setSize(new Dimension(100, 80));

        bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
        beatBar = new BeatBar();
        beatBar.setValue(0);

        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputLabel);

        panelView.add(bpmPanel);

        frameView.getContentPane().add(panelView, BorderLayout.CENTER);
        frameView.pack();
        frameView.setVisible(true);
    }

    public void createControls() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlsFrame = new JFrame("Controls");
        controlsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlsFrame.setSize(new Dimension(100, 80));

        controlsPanel = new JPanel(new GridLayout(1, 2));

        menuBar = new JMenuBar();
        menu = new JMenu("DJ");

        startMenuItem = new JMenuItem("Start");
        menu.add(startMenuItem);
        startMenuItem.addActionListener(e -> controller.start());

        stopMenuItem = new JMenuItem("Stop");
        menu.add(stopMenuItem);
        stopMenuItem.addActionListener(e -> {
            controller.stop();
            bpmOutputLabel.setText("offline");
        });

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));
        menu.add(exit);

        menuBar.add(menu);
        controlsFrame.setJMenuBar(menuBar);

        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("BPM:", SwingConstants.RIGHT);
        setBpmButton = new JButton("Set");
        setBpmButton.setSize(new Dimension(10, 40));
        increaseBpmButton = new JButton(">>");
        decreaseBpmButton = new JButton("<<");
        setBpmButton.addActionListener(this);
        increaseBpmButton.addActionListener(this);
        decreaseBpmButton.addActionListener(this);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));
        buttonsPanel.add(increaseBpmButton);
        buttonsPanel.add(decreaseBpmButton);

        JPanel inputPanel = new JPanel(new GridLayout(1, 2));
        inputPanel.add(bpmLabel);
        inputPanel.add(bpmTextField);

        JPanel innerControlsPanel = new JPanel(new GridLayout(3, 1));
        innerControlsPanel.add(inputPanel);
        innerControlsPanel.add(setBpmButton);
        innerControlsPanel.add(buttonsPanel);
        controlsPanel.add(innerControlsPanel);

        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        controlsFrame.getRootPane().setDefaultButton(setBpmButton);
        controlsFrame.getContentPane().add(controlsPanel, BorderLayout.CENTER);

        controlsFrame.pack();
        controlsFrame.setVisible(true);
    }

    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == setBpmButton) {
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        } else if (source == increaseBpmButton) {
            controller.increaseBPM();
        } else if (source == decreaseBpmButton) {
            controller.decreaseBPM();
        }
    }

    @Override
    public void updateBPM() {
        if (model != null) {
            int bpm = model.getBPM();
            if (bpm == 0) {
                bpmOutputLabel.setText("offline");
            } else if (bpmOutputLabel != null) {
                bpmOutputLabel.setText("Current BPM value: " + bpm);
            }
        }
    }

    @Override
    public void updateBeat() {
        if (beatBar != null) {
            beatBar.setValue(100);
        }
    }

    //558

}
