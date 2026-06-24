package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetUserById() {

        // Create test user
        User user = new User();
        user.setId(1L);
        user.setName("Dinesh");

        // Stub repository
        when(
                userRepository.findById(1L)
        ).thenReturn(
                Optional.of(user)
        );

        // Call service
        User result =
                userService.getUserById(1L);

        // Verify
        assertNotNull(result);

        assertEquals(
                "Dinesh",
                result.getName()
        );

        verify(userRepository)
                .findById(1L);
    }

}