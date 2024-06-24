package model.api;

import java.util.List;
import model.util.Position;

public interface Player {

    int getId();
    String getName();
    List<Character> getCharacters();
    Bunker getBunker();
    Base getMainBase();
    double getTerritoryPercentage();
    void addCharacter(Troop character);
    void removeCharacter(Troop character);
    void moveCharacter(Troop character, Position newPosition);
    void calculateTerritoryPercentage();
}