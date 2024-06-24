package model.api;

import java.util.List;

public interface Game {
    void startGame();
    void endGame();
    void nextTurn();
    void checkVictoryConditions();
    void generateDailyResources();
    int getCurrentTurn();
    List<Player> getPlayers();
    Board getBoard();
}