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
    
}
