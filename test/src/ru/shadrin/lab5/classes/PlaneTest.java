package ru.shadrin.lab4;
import org.junit.Test;
import ru.shadrin.lab4.Plane;
import ru.shadrin.lab4.Plane;

import static org.junit.Assert.*;
public class PlaneTest {

  @Test
    public void testDimension() {
        System.out.println("Проверка метода dimension()");
        Plane p = new Plane(3, 4, 2, 1);
        assertEquals(3, p.dimension(), 0.00001);
    }
}
