package com.grid.maze;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiddleRepository extends JpaRepository<Riddle, Long> {
}
