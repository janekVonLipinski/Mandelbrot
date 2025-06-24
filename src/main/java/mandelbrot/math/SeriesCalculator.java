package mandelbrot.math;

import mandelbrot.model.ComplexNumber;

public class SeriesCalculator {

    public int getNumberOfIterations(ComplexNumber c, int threshHold) {

        ComplexNumber current = null;
        int numberOfIterations = 0;

        while (current == null || current.getAmount() < threshHold) {

            if (numberOfIterations == 250) {
                return 250;
            }

            if (current == null) {
                current = new ComplexNumber(c.getX(), c.getY());
                numberOfIterations++;
                continue;
            }

            ComplexNumber temp = current.potentiate(2);
            current = temp.add(c);
            numberOfIterations++;
        }

        return numberOfIterations;
    }
}
