package ru.shadrin.lab4;
import org.junit.Test;
import ru.shadrin.lab4.Point;
import ru.shadrin.lab4.Point;


import static org.junit.Assert.*;
public class PointTest {

    @Test
    public void testDimension() {
        System.out.println("Проверка метода dimension()");
        Point p = new Point(3, 4);
        assertEquals(1, p.dimension(), 0.00001);
    }
}
