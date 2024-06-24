package view;

import javax.swing.*;
import java.awt.*;

public class CharacterView {
    private JPanel panel;
    private String name;

    public CharacterView(String name) {
        this.name = name;
        initializeCharacter();
    }

    private void initializeCharacter() {
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(40, 40));

        JLabel label = new JLabel(name);
        label.setForeground(Color.WHITE);
        panel.add(label);
    }

    public JPanel getPanel() {
        return panel;
    }
}