import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    Calculator calculator = new Calculator();

    @Test
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }
}