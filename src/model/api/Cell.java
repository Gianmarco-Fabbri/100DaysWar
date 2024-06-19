package model.api;

import model.util.Position;

public interface Cell {
    Position getPosition();
    Character getOccupant();
    Player getOwner();
    void setOccupant(Character character);
    void removeOccupant();
    void setOwner(Player player);
}