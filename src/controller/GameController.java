package controller;

import model.Game;
import view.GameView;

public class GameController {
    private Game game;
    private GameView view;

    public GameController(Game game, GameView view) {
        this.game = game;
        this.view = view;
    }

    public void startGame() {
        game.start();
        view.displayGameName(game.getName());
    }

    public void setGameName(String name) {
        game.setName(name);
    }
}