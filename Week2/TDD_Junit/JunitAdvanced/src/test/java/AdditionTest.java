import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(4, 6));
    }
}