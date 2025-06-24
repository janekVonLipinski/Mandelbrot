package mandelbrot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ComplexNumber {

    private double x;
    private double y;

    public ComplexNumber add(ComplexNumber number) {
        double x = this.x + number.x;
        double y = this.y + number.y;

        return new ComplexNumber(x, y);
    }

    public ComplexNumber potentiate(int n) {

        double r = getAmount();
        double phi = getPhi();

        double newPhi = phi * n;
        double newR = Math.pow(r, n);

        double newX = newR * Math.cos(newPhi);
        double newY = newR * Math.sin(newPhi);

        return new ComplexNumber(newX, newY);
    }

    public double getAmount() {
        return Math.sqrt(x * x + y * y);
    }

    public double getPhi() {
        double phi =  Math.atan(y / x);
        return phi;
    }
}
