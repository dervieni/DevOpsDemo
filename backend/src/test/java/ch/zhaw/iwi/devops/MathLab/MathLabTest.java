package ch.zhaw.iwi.devops.MathLab;

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
    public void EvenTEST() {
        MathLab m = new MathLab();
        Assertions.assertEquals("Die Summe 10 ist gerade", m.even(5, 5));
        Assertions.assertEquals("Die Summe 15 ist nicht gerade", m.even(7, 8));
        Assertions.assertEquals("Die Summe 13 ist nicht gerade", m.even(6, 7));
    }

    @Test
    public void EvenPrimeTEST() {
        MathLab m = new MathLab();
        Assertions.assertEquals("Die Summe 10 ist gerade und keine Primzahl", m.prime(5, 5));
        Assertions.assertEquals("Die Summe 15 ist nicht gerade und keine Primzahl", m.prime(7, 8));
        Assertions.assertEquals("Die Summe 13 ist nicht gerade und eine Primzahl", m.prime(6, 7));
    }

}
