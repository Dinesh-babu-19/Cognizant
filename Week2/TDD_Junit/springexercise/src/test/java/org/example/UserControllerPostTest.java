package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
public class UserControllerPostTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private UserService userService;

    @Test
    void testCreateUser() throws Exception {

        User savedUser =
                new User(1L, "Dinesh");

        when(
                userService.saveUser(
                        any(User.class)
                )
        ).thenReturn(savedUser);

        User requestUser =
                new User(
                        null,
                        "Dinesh"
                );

        mockMvc.perform(
                        post("/users")
                                .contentType(
                                        MediaType.APPLICATION_JSON
                                )
                                .content(
                                        objectMapper
                                                .writeValueAsString(
                                                        requestUser
                                                )
                                )
                )
                .andExpect(
                        status().isOk()
                )
                .andExpect(
                        jsonPath("$.id")
                                .value(1)
                )
                .andExpect(
                        jsonPath("$.name")
                                .value("Dinesh")
                );
    }
}