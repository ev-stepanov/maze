package com.grid.load_riddles.service;

import com.grid.load_riddles.entity.Riddle;
import com.grid.load_riddles.repository.RiddleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiddleServiceImpl implements RiddleService {
    private final RiddleRepository riddleRepository;

    public RiddleServiceImpl(RiddleRepository riddleRepository) {
        this.riddleRepository = riddleRepository;
    }

    @Override
    public Riddle getRiddleById(Long id) {
        return riddleRepository.getOne(id);
    }

    @Override
    public List<Riddle> findAllRiddleByLevel(Integer level) {
        return riddleRepository.findAll();
    }
}
