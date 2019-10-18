package com.grid.maze.singletons;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Graph {
    private static final Map<Long, List<Long>> GRAPH = new HashMap<>();

    public void addVertex(Long currentVertex, List<Long> neighbors) {
        GRAPH.put(currentVertex, neighbors);
    }

    public static List<Long> getNeighbors(Long vertex) {
        return GRAPH.get(vertex);
    }

    public static void printNeighbors (Long vertex) {
        System.out.println(GRAPH.get(vertex));
    }

    public static Integer getFinishRoom() {
        return GRAPH.size() - 1;
    }
}
