package controller;

import model.impl.GameImpl;
import view.GameView;

public class GameController {
    private GameImpl game;
    private GameView view;

    public GameController(GameImpl game, GameView view) {
        this.game = game;
        this.view = view;
    }

    public void startGame() {
        game.startGame();
    }

    public void setGameName(String name) {
        game.setName(name);
    }
}