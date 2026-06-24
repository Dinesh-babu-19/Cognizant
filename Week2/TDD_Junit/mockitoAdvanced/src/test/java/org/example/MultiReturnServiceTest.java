package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MultiReturnServiceTest {

    @Test
    void testServiceWithMultipleReturnValues() {

        // Create mock
        Repository mockRepository =
                mock(Repository.class);

        // Different returns for consecutive calls
        when(mockRepository.getData())
                .thenReturn(
                        "First Mock Data"
                )
                .thenReturn(
                        "Second Mock Data"
                );

        // Inject mock
        Service service =
                new Service(
                        mockRepository
                );

        // First call
        String firstResult =
                service.processData();

        // Second call
        String secondResult =
                service.processData();

        // Verify
        assertEquals(
                "Processed First Mock Data",
                firstResult
        );

        assertEquals(
                "Processed Second Mock Data",
                secondResult
        );

        // Verify called twice
        verify(
                mockRepository,
                times(2)
        ).getData();
    }
}