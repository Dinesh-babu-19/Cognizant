import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call method
        service.fetchData();

        // Verify interaction
        verify(mockApi).getData();

        // Call method with specific argument
        service.processData("Hello Mockito");

        // Verify using argument matcher
        verify(mockApi).sendData(anyString());

        // Call method
        service.notifyUser();

        // Verify interaction
        verify(mockApi).sendNotification("Welcome User");
    }
}