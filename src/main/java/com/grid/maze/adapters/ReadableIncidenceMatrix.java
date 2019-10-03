package com.grid.maze.adapters;

import java.io.InvalidObjectException;
import java.util.List;

public interface ReadableIncidenceMatrix {
    void parse(List<List<Long>> incidenceMatrix) throws InvalidObjectException;
}
