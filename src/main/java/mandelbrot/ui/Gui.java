package mandelbrot.ui;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    public Gui() throws HeadlessException {

        int width = 1000;
        int height = 1000;

        MandelBrotPlotter plotter = new MandelBrotPlotter(width, height, 100000);
        add(plotter);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
    }

}
