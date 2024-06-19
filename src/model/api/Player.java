package model.api;

import java.util.List;

import javax.swing.text.Position;

public interface Player {

    int getId();
    String getName();
    List<Character> getCharacters();
    Bunker getBunker();
    Base getMainBase();
    double getTerritoryPercentage();
    void addCharacter(Character character);
    void removeCharacter(Character character);
    void moveCharacter(Character character, Position newPosition);
    void calculateTerritoryPercentage();
}