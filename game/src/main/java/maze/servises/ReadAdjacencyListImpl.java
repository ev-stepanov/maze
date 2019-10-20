package maze.servises;

import maze.singletons.Graph;
import org.springframework.stereotype.Component;

import java.io.InvalidObjectException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReadAdjacencyListImpl implements ReadAdjacencyList {
    public void parse(List<String> adjacencyList) throws InvalidObjectException {
        for (String adj:adjacencyList) {
            String[] listVertexAndHisNeighbors = adj.split("-");
            if (listVertexAndHisNeighbors.length < 2) {
                throw new InvalidObjectException("Wrong format");
            }
            Long currentVertex = Long.parseLong(listVertexAndHisNeighbors[0]);

            String[] neighborsList = listVertexAndHisNeighbors[1].split(",");
            List<Long> neighbors = Arrays.stream(neighborsList)
                    .map(Long::parseLong)
                    .collect(Collectors.toList());

            Graph graph = new Graph();
            graph.addVertex(currentVertex, neighbors);
        }
    }
}
