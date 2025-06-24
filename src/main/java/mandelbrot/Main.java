package mandelbrot;

import mandelbrot.ui.MandelBrotPlotter;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() throws HeadlessException {

        int width = 1000;
        int height = 1000;

        MandelBrotPlotter plotter = new MandelBrotPlotter();
        add(plotter);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
    }
}
