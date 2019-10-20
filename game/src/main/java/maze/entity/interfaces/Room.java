package maze.entity.interfaces;

public interface Room {
    void getNeighboringRooms();
    void setIdRoom(Long id);
    void useGhost();
}
