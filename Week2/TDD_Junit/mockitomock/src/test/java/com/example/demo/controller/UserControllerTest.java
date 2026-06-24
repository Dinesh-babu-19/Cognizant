package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.context.bean.override.mockito.MockitoBean;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    UserService userService;

    @Test
    void testGetUser() throws Exception {

        User user = new User();
        user.setId(1L);
        user.setName("John");

        Mockito.when(
                        userService.getUserById(1L))
                .thenReturn(user);

        mockMvc.perform(get("/users/1"))
                .andExpect(status().isOk())
                .andExpect(
                        jsonPath("$.id")
                                .value(1))
                .andExpect(
                        jsonPath("$.name")
                                .value("John"));
    }
}