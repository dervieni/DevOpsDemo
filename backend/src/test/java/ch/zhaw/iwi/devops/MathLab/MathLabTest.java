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
        Assertions.assertEquals("Die Summe 130 ist grösser als 100", m.size(60, 70));
    }

    @Test
    public void EvenTEST() {
        MathLab m = new MathLab();
        Assertions.assertEquals("Die Summe 10 ist kleiner als 100 und ist gerade", m.even(5, 5));
        Assertions.assertEquals("Die Summe 15 ist kleiner als 100 und ist nicht gerade", m.even(7, 8));
        Assertions.assertEquals("Die Summe 13 ist kleiner als 100 und ist nicht gerade", m.even(6, 7));
    }

    @Test
    public void PrimeTEST() {
        MathLab m = new MathLab();
        Assertions.assertEquals("Die Summe 10 ist kleiner als 100 und ist gerade, sowie keine Primzahl", m.prime(5, 5));
        Assertions.assertEquals("Die Summe 15 ist kleiner als 100 und ist nicht gerade, sowie keine Primzahl", m.prime(7, 8));
        Assertions.assertEquals("Die Summe 13 ist kleiner als 100 und ist nicht gerade, sowie eine Primzahl", m.prime(6, 7));
        Assertions.assertEquals("Die Summe 99 ist kleiner als 100 und ist nicht gerade, sowie keine Primzahl", m.prime(90, 9));
        Assertions.assertEquals("Die Summe 19 ist kleiner als 100 und ist nicht gerade, sowie eine Primzahl", m.prime(6, 13));
        Assertions.assertEquals("Die Summe 42 ist kleiner als 100 und ist gerade, sowie keine Primzahl", m.prime(3, 39));
        Assertions.assertEquals("Die Summe 29 ist kleiner als 100 und ist nicht gerade, sowie eine Primzahl", m.prime(7, 22));
        Assertions.assertEquals("Die Summe 1 ist kleiner als 100 und ist nicht gerade, sowie keine Primzahl", m.prime(1, 0));
    }


}
