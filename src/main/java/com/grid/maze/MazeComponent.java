package com.grid.maze;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MazeComponent {
    private final Map<Long, List<Long>> GRAPH = new HashMap<>();

    @PostConstruct
    private void postConstruct() {

    }
}
