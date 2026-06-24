package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void testServiceWithMockRestClient() {

        // Create mock REST client
        RestClient mockRestClient =
                mock(RestClient.class);

        // Stub API response
        when(mockRestClient.getResponse())
                .thenReturn("Mock Response");

        // Inject mock
        ApiService apiService =
                new ApiService(mockRestClient);

        // Execute service method
        String result =
                apiService.fetchData();

        // Verify output
        assertEquals(
                "Fetched Mock Response",
                result
        );

        // Verify API was called
        verify(mockRestClient)
                .getResponse();
    }
}