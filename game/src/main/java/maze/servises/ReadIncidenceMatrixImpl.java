package maze.servises;

import org.springframework.stereotype.Component;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ReadIncidenceMatrixImpl implements ReadIncidenceMatrix {
    private final ReadAdjacencyListImpl readAdjacencyListImpl;

    public ReadIncidenceMatrixImpl(ReadAdjacencyListImpl readAdjacencyListImpl) {
        this.readAdjacencyListImpl = readAdjacencyListImpl;
    }
    @Override
    public void parse(List<String> incidenceMatrix) throws InvalidObjectException {
        readAdjacencyListImpl.parse(convert(incidenceMatrix));
    }

    private List<String> convert(List<String> incidenceMatrix) {
        List<String> adjacencyList = new ArrayList<>();
        StringBuilder sb;
        for (int i = 0; i < incidenceMatrix.size(); i++) {
            final String[] listVertex = incidenceMatrix.get(i).replace(" ", "").split(",");
            sb = new StringBuilder();
            sb.append(i).append("-");
            for (int j = 0; j < listVertex.length; j++) {
                long value = listVertex[j].equals("0") ? 0 : 1;
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