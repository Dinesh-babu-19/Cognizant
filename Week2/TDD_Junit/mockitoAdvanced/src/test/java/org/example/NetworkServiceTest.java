package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class NetworkServiceTest {

    @Test
    void testServiceWithMockNetworkClient() {

        // Create mock
        NetworkClient mockNetworkClient =
                mock(NetworkClient.class);

        // Stub network interaction
        when(mockNetworkClient.connect())
                .thenReturn("Mock Connection");

        // Inject mock
        NetworkService networkService =
                new NetworkService(
                        mockNetworkClient
                );

        // Execute
        String result =
                networkService.connectToServer();

        // Verify output
        assertEquals(
                "Connected to Mock Connection",
                result
        );

        // Verify interaction
        verify(mockNetworkClient)
                .connect();
    }
}