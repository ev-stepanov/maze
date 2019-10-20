package com.grid.load_riddles.repository;

import com.grid.load_riddles.entity.Riddle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiddleRepository extends JpaRepository<Riddle, Long> {
}
