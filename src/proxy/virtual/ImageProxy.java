package proxy.virtual;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Optional;
import java.util.function.Function;

public class ImageProxy implements Icon {

    private static final int ICON_WIDTH = 800;
    private static final int ICON_HEIGHT = 600;
    private static final String LOADING_SCREEN_MESSAGE = "CD Cover is loading, please wait...";
    private static final String ICON_DESCRIPTION = "CD Cover";
    private final URL imageUrl;
    private ImageIcon imageIcon;
    private boolean downloading = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString(LOADING_SCREEN_MESSAGE, x + 300, y + 190);
            if (!downloading) {
                downloading = true;
                Thread downloadingThread = new Thread(() -> {
                    try {
                        imageIcon = new ImageIcon(imageUrl, ICON_DESCRIPTION);
                        c.repaint();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                });
                downloadingThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        return getIconAttribute(ImageIcon::getIconWidth, ICON_WIDTH);
    }

    @Override
    public int getIconHeight() {
        return getIconAttribute(ImageIcon::getIconHeight, ICON_HEIGHT);
    }

    private int getIconAttribute(Function<ImageIcon, Integer> attributeGetter, int defaultValue) {
        return Optional.ofNullable(imageIcon).map(attributeGetter).orElse(defaultValue);
    }

    //497

}
