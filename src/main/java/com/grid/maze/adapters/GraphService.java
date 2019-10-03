package com.grid.maze.adapters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class GraphService {
    @Value("${graph.path.name}")
    private String path;

    private final ReadableIncidenceMatrix readableIncidenceMatrix;

    public GraphService(ReadableIncidenceMatrix readableIncidenceMatrix) {
        this.readableIncidenceMatrix = readableIncidenceMatrix;
    }

    public void readGraph() throws IOException {
        File file = new File(path);
        List<List<Long>> incidenceMatrix = new ArrayList<>();
        List<Long> row;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                row = new ArrayList<>();
                for (int i = 0; i < str.length(); i++) {
                    row.add(Long.parseLong(str.substring(i, i + 1)));
                }
                incidenceMatrix.add(row);
            }
        }

        readableIncidenceMatrix.parse(incidenceMatrix);
    }
}
