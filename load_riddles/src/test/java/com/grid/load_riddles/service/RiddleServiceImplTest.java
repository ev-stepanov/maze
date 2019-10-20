package com.grid.load_riddles.service;

import com.grid.load_riddles.entity.Riddle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RiddleServiceImplTest {
    @Autowired
    private RiddleService riddleService;

    @Test
    void getRiddleById() {
        final Riddle riddleById = riddleService.getRiddleById(1L);
        assertEquals(1L, riddleById.getId());

    }

    @Test
    void findAllRiddleByLevel() {
        final List<Riddle> allRiddleByLevel = riddleService.findAllRiddleByLevel(1);
        assertEquals(1, allRiddleByLevel.size());
    }
}