package mandelbrot.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    private ComplexNumber sut;

    @Test
    void given() {
        sut = new ComplexNumber(1, 1);
        double res = sut.getPhi();
        assertEquals(Math.PI / 4, res, 0.01);
    }

    @Test
    void doesItUseBogenMass() {
        double res = Math.cos(Math.PI / 2);
        assertEquals(0, res, 0.01);
    }

    @Test
    void sqauredCorrectly() {
        ComplexNumber complexNumber = new ComplexNumber(1, 1);

        ComplexNumber res = complexNumber.potentiate(2);

        assertEquals(0, res.getX() ,0.01);
        assertEquals(2, res.getY() ,0.01);
    }



}