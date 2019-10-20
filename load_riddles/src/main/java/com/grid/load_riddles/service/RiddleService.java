package com.grid.load_riddles.service;

import com.grid.load_riddles.entity.Riddle;

import java.util.List;

public interface RiddleService {
    Riddle getRiddleById(Long id);
    List<Riddle> findAllRiddleByLevel(Integer level);
}
