package com.grid.maze.adapters;

import com.grid.maze.singletons.Graph;
import com.grid.maze.entity.Vertex;
import org.springframework.stereotype.Component;

import java.io.InvalidObjectException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GraphAdjacencyListParser implements ReadableAdjacencyList {
    public void parse(List<String> adjacencyList) throws InvalidObjectException {
        for (String adj:adjacencyList) {
            String[] listVertexAndHisNeighbors = adj.split("-");
            if (listVertexAndHisNeighbors.length < 2) {
                throw new InvalidObjectException("Wrong format");
            }
            Long currentVertex = Long.parseLong(listVertexAndHisNeighbors[0]);

            String[] neighborsList = listVertexAndHisNeighbors[1].split(",");
            List<Vertex> neighbors = Arrays.stream(neighborsList)
                    .map(neighbor -> new Vertex(Long.parseLong(neighbor)))
                    .collect(Collectors.toList());

            Graph graph = Graph.createGraph();
            graph.addVertex(currentVertex, neighbors);
        }
    }
}
