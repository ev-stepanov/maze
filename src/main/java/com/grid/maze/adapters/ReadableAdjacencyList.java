package com.grid.maze.adapters;

import java.io.InvalidObjectException;
import java.util.List;

public interface ReadableAdjacencyList {
    void parse(List<String> adjacencyList) throws InvalidObjectException;
}
