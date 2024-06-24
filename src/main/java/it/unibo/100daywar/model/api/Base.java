package model.api;

import model.util.Position;

public interface Base {

    Position getPosition();
    int getPlayerId();
    int getEnergyCost();
    boolean isConquered(Character character);
}