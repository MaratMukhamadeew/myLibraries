package practice.different;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSummaTest {
    @Test
    public void calculateTest() throws NoSuchMethodException {
        double result = SimpleSumma.calculate(0.0,4.0);
        assertEquals(21.33333352444018, result);
    }
}