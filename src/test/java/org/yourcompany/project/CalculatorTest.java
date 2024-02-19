import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
     @Test
     public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum1 = calculator.evaluate("1+2+3");
        int sum2 = calculator.evaluate("1+2+5");
        assertEquals(6, sum1);
        assertEquals(7, sum2);

     }
}
