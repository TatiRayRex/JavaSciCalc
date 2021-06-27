import com.zipcodewilmington.scientific_calculator.Calculator;
import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }
}