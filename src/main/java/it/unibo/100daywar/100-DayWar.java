package main;

import javax.swing.SwingUtilities;

import model.impl.*;
import model.api.*;
import view.*;
import controller.*;

public class Main {
    public static void main(String[] args) {
        // Inizializza il modello
        Game game = new GameImpl();

        // Inizializza la vista
        GameView gameView = new GameView();

        // Inizializza il controller
        Controller controller = new GameController(game, gameView);

        // Mostra la vista
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainView mainView = new MainView();
                mainView.show();
            }
        });
    }
}