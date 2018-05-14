import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(6, 2);
    }

    @Test
    public void hasNumberOne(){
        assertEquals(6, calculator.getNumberOne());
    }

    @Test
    public void hasNumberTwo(){
        assertEquals(2, calculator.getNumberTwo());
    }

    @Test
    public void canAdd(){
        assertEquals(8, calculator.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(12, calculator.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide());
    }



}
