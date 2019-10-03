package com.grid.maze.singletons;

import com.grid.maze.entity.Vertex;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Graph {
    private static volatile Graph graph;
    private Map<Vertex, List<Vertex>> adjVertices;

    private Graph() {
        adjVertices = new HashMap<>();
    }

    public static Graph createGraph() {
        if (graph == null) {
            synchronized (Graph.class) {
                if (graph == null) {
                    graph = new Graph();
                }
            }
        }

        return graph;
    }

    public void addVertex(Long id, List<Vertex> neighbors) {
        adjVertices.putIfAbsent(new Vertex(id), neighbors);
    }
}
