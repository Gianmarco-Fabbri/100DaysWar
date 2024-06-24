package view;

import javax.swing.*;
import java.awt.*;

public class MainView {
    private JFrame frame;

    public MainView() {
        frame = new JFrame("Conq.io Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        GameView gameView = new GameView();
        frame.add(gameView.getPanel(), BorderLayout.CENTER);
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainView mainView = new MainView();
                mainView.show();
            }
        });
    }
}