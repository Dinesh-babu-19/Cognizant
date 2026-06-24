package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FileServiceTest {

    @Test
    void testServiceWithMockFileIO() {

        // Create mocks
        MyFileReader mockFileReader =
                mock(MyFileReader.class);

        MyFileWriter mockFileWriter =
                mock(MyFileWriter.class);

        // Stub file reading
        when(mockFileReader.read())
                .thenReturn("Mock File Content");

        // Inject mocks
        FileService fileService =
                new FileService(
                        mockFileReader,
                        mockFileWriter
                );

        // Execute
        String result =
                fileService.processFile();

        // Verify result
        assertEquals(
                "Processed Mock File Content",
                result
        );

        // Verify interactions
        verify(mockFileReader)
                .read();

        verify(mockFileWriter)
                .write(
                        "Processed Mock File Content"
                );
    }
}