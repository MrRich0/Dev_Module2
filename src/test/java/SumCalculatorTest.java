import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumOfNumber3(){
        int actual = sumCalculator.sum(3);

        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSumOfNumber1(){
        int actual = sumCalculator.sum(1);

        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSumOfNumber0(){
        int number = 0;
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> { sumCalculator.sum(number);
        });
    }
}