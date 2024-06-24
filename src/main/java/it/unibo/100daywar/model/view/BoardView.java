package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BoardView {
    private JPanel panel;
    private static final int CELL_SIZE = 40;
    private int width = 20;  // Larghezza della board
    private int height = 15;  // Altezza della board

    public BoardView() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(height, width));
        initializeBoard();
    }

    private void initializeBoard() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                JPanel cell = createCell(x, y);
                panel.add(cell);
            }
        }
    }

    private JPanel createCell(int x, int y) {
        JPanel cell = new JPanel();
        cell.setPreferredSize(new Dimension(CELL_SIZE, CELL_SIZE));
        cell.setBackground(Color.LIGHT_GRAY);
        cell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cell.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Cell clicked: (" + x + ", " + y + ")");
            }
        });
        return cell;
    }

    public JPanel getPanel() {
        return panel;
    }
}