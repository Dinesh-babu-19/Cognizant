import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {

    @Test
    void testThrowException() {
        ExceptionThrower exceptionThrower = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, () -> {
            exceptionThrower.throwException();
        });
    }
}