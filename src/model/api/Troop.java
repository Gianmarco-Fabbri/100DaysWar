package model.api;

import model.util.Position;

public interface Troop {
    int getId();
    String getName();
    int getEnergy();
    int getMaxEnergy();
    Position getPosition();
    int getPlayerId();
    int getDiceCount();
    void move(Position newPosition);
    void attack(Character opponent);
    void defend();
    void receiveEnergy(int amount);
    boolean isIsolated(Board board);
}