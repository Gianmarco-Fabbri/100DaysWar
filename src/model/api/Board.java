package model.api;

import model.util.Position;

public interface Board {
    Cell getCell(Position position);
    boolean isPositionValid(Position position);
}