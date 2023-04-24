package ch.zhaw.iwi.devops.mathlab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MathLabTest {

    @Test
    public void SumTEST() {
        MathLab m = new MathLab();
        Assertions.assertEquals(10, m.sum(5, 5));
        Assertions.assertEquals(15, m.sum(7, 8));
        Assertions.assertEquals(13, m.sum(6, 7));
    }

    @Test
    public void SizeTEST() {
        MathLab m = new MathLab();
        Assertions.assertEquals("Die Summe 10 ist kleiner als 100", m.size(5, 5));
        Assertions.assertEquals("Die Summe 15 ist kleiner als 100", m.size(7, 8));
        Assertions.assertEquals("Die Summe 13 ist kleiner als 100", m.size(6, 7));
    }

}
