package view;

import javax.swing.*;
import java.awt.*;
import api.Controller;

public class GameView {
    private JPanel panel;
    private Controller controller;

    public GameView() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel title = new JLabel("Conq.io Game", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 24));
        panel.add(title, BorderLayout.NORTH);

        BoardView boardView = new BoardView(this);  // Passa GameView a BoardView
        panel.add(boardView.getPanel(), BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void updateView() {
        // Aggiorna la vista in base allo stato del modello
        panel.repaint();
    }

    public Controller getController() {
        return controller;
    }
}