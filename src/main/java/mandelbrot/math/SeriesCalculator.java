package mandelbrot.math;

import mandelbrot.model.ComplexNumber;

public class SeriesCalculator {

    public int getNumberOfIterations(ComplexNumber c, int threshHold) {

        ComplexNumber current = new ComplexNumber(0, 0);
        int numberOfIterations = 0;

        while (current.getAmount() < threshHold) {

            ComplexNumber temp = current.potentiate(2);
            current = temp.add(c);
            numberOfIterations++;
        }

        return numberOfIterations;
    }
}
