package mandelbrot.ui;

import lombok.AllArgsConstructor;
import mandelbrot.math.SeriesCalculator;
import mandelbrot.model.ComplexNumber;

import javax.swing.*;
import java.awt.*;

public class MandelBrotPlotter extends JPanel {

    private static final int X_MAX = 1;
    private static final int X_MIN = -2;
    private static final int Y_MIN = -1;
    private static final int Y_MAX = 1;
    private int width;
    private int height;
    private int threshold;

    private final SeriesCalculator seriesCalculator = new SeriesCalculator();

    public MandelBrotPlotter(int width, int height, int threshold) {
        this.width = width;
        this.height = height;
        this.threshold = threshold;

        setSize(width, height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (int x = 0; x < width; x++) {

            if (x == 0) {
                continue;
            }

            for (int y = 0; y < height; y++) {
                double xDouble = mapToXDecimalValue(x);
                double yDouble = mapToYDecimalValue(y);

                int numberOfIterations = seriesCalculator.getNumberOfIterations(new ComplexNumber(xDouble, yDouble), threshold);
                Color color = determineColor(numberOfIterations);

                g2d.setColor(color);
                g2d.fillOval(x, y, 2, 2);
            }
        }
    }

    private Color determineColor(int numberOfIterations) {

        int  shadeOfGray = 255 - numberOfIterations;

        return new Color(0, 0, shadeOfGray);
    }

    private double mapToXDecimalValue(int xPixel) {
        return ((X_MAX - X_MIN) / (double) width) * xPixel + X_MIN;
    }

    private double mapToYDecimalValue(int yPixel) {
        return -(((Y_MAX - Y_MIN) / (double) height) * yPixel + Y_MIN);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }
}
