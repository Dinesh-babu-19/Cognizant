import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class PerformanceTesterTest {

    @Test
    void testPerformTask() {
        PerformanceTester tester = new PerformanceTester();

        assertTimeout(Duration.ofSeconds(1), () -> {
            tester.performTask();
        });
    }
}