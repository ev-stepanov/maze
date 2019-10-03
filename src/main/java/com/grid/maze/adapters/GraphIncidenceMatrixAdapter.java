package com.grid.maze.adapters;

import org.springframework.stereotype.Component;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

@Component
public class GraphIncidenceMatrixAdapter implements ReadableIncidenceMatrix {
    private final GraphAdjacencyListParser graphAdjacencyListParser;

    public GraphIncidenceMatrixAdapter(GraphAdjacencyListParser graphAdjacencyListParser) {
        this.graphAdjacencyListParser = graphAdjacencyListParser;
    }

    @Override
    public void parse(List<List<Long>> incidenceMatrix) throws InvalidObjectException {
        graphAdjacencyListParser.parse(convert(incidenceMatrix));
    }

    private List<String> convert(List<List<Long>> incidenceMatrix) {
        List<String> adjacencyList = new ArrayList<>();
        StringBuilder sb;
        for (int i = 0; i < incidenceMatrix.size(); i++) {
            sb = new StringBuilder();
            sb.append(i).append("-");
            for (int j = 0; j < incidenceMatrix.get(i).size(); j++) {
                Long value = incidenceMatrix.get(i).get(j);
                if (i != j && value == 1) {
                    sb.append(j).append(",");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            adjacencyList.add(sb.toString());
        }
        return adjacencyList;
    }
}
