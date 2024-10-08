package demo.parallel.test;

import static org.junit.jupiter.api.Assertions.*;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

public class ComplexTest {

    @Test
    public void testMinus() {
        // Тест 1: Обычный случай
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 1);
        a.minus(b);
        assertEquals(3.0, a.getRe(), 0.00001, "Real part after minus operation should be 3");
        assertEquals(2.0, a.getIm(), 0.00001, "Imaginary part after minus operation should be 2");

        // Тест 2: Отрицательные числа
        Complex c = new Complex(-2, -3);
        Complex d = new Complex(-1, -1);
        c.minus(d);
        assertEquals(-1.0, c.getRe(), 0.00001, "Real part after minus operation should be -1");
        assertEquals(-2.0, c.getIm(), 0.00001, "Imaginary part after minus operation should be -2");

        // Тест 3: Нулевые значения
        Complex e = new Complex(0, 0);
        Complex f = new Complex(0, 0);
        e.minus(f);
        assertEquals(0.0, e.getRe(), 0.00001, "Real part after minus operation should be 0");
        assertEquals(0.0, e.getIm(), 0.00001, "Imaginary part after minus operation should be 0");

        // Тест 4: Вычитание себя
        Complex g = new Complex(7, 4);
        g.minus(g);
        assertEquals(0.0, g.getRe(), 0.00001, "Real part after minus operation should be 0");
        assertEquals(0.0, g.getIm(), 0.00001, "Imaginary part after minus operation should be 0");

    }
    @Test
    public void testDiv() {
        Complex a = new Complex(5, 5);
        Complex b = new Complex(1, 1);
        Complex result = a.div(b);
        assertEquals(5.0, result.getRe());
        assertEquals(0.0, result.getIm());
    }

    @Test
    public void testLengthSQ() {
        Complex a = new Complex(3, 4);
        assertEquals(25.0, a.lengthSQ());
    }
}
