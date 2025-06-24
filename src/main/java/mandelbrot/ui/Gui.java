package mandelbrot.ui;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    public Gui() {

        int width = 1000;
        int height = 1000;

        MandelBrotPlotter plotter = new MandelBrotPlotter(width, height, 1000);
        add(plotter);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

}
