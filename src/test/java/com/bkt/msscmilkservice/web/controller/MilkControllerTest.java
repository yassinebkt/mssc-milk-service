package com.bkt.msscmilkservice.web.controller;

import com.bkt.msscmilkservice.web.model.MilkDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MilkController.class)
class MilkControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBeerById() throws Exception {
        mockMvc.perform(get("/api/v1/milk/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewMilk() throws Exception {
        MilkDto milkDto = MilkDto.builder().build();
        String milkDtoJson = objectMapper.writeValueAsString(milkDto);

        mockMvc.perform(post("/api/v1/milk/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(milkDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateMilkById() throws Exception {
        MilkDto milkDto = MilkDto.builder().build();
        String milkDtoJson = objectMapper.writeValueAsString(milkDto);

        mockMvc.perform(put("/api/v1/milk/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(milkDtoJson))
                .andExpect(status().isNoContent());
    }
}