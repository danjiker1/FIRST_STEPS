import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){

        int a = 5;
        int b = 2;

        int result = calculator.add(a, b);

        assertEquals(7, result, "5 + 2 = 7");


    }

    @Test
    public void testMinus(){

        int a =15;
        int b = 6;
        int c = 2;

        int result = calculator.minus(a, b, c);

        assertEquals(7, result, "15 - 6 - 2 = 7");
    }



}
