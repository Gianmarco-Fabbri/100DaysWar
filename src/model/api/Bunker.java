package model.api;

import model.util.Position;

public interface Bunker {

    Position getPosition();
    int getPlayerId();
    boolean isDestroyed(Character character);
    void relocate(Position newPosition);
}