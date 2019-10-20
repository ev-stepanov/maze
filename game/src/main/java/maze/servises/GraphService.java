package maze.servises;

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
    @Value("${graph.path}")
    private String path;

    private final ReadIncidenceMatrix readIncidenceMatrix;

    public GraphService(ReadIncidenceMatrix readIncidenceMatrix) {
        this.readIncidenceMatrix = readIncidenceMatrix;
    }

    public void readGraph() throws IOException {
        File file = new File(path);

        List<String> rowIncidenceMatrix = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                rowIncidenceMatrix.add(str);
            }
        }
        readIncidenceMatrix.parse(rowIncidenceMatrix);
    }
}
