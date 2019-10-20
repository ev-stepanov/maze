package maze.servises;

import java.io.InvalidObjectException;
import java.util.List;

public interface ReadIncidenceMatrix {
    void parse(List<String> incidenceMatrix) throws InvalidObjectException;
}
