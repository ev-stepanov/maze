package maze.servises;

import java.io.InvalidObjectException;
import java.util.List;

public interface ReadAdjacencyList {
    void parse(List<String> adjacencyList) throws InvalidObjectException;
}
