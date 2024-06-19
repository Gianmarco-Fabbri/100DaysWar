package model.main;

import model.api.*;
import model.impl.*;
import model.util.Position;

public class Main {
    public static void main(String[] args) {
        // Creazione dei personaggi
        Position startPosition = new Position(0, 0);
        Troop character1 = new TroopImpl(1, "Character 1", 10, startPosition, 1);
        Troop character2 = new TroopImpl(2, "Character 2", 10, startPosition, 2);

        // Combattimento tra i due personaggi
        character1.attack(character2);

        // Output dello stato dei personaggi dopo il combattimento
        System.out.println(character1.getName() + " energy: " + character1.getEnergy());
        System.out.println(character2.getName() + " energy: " + character2.getEnergy());
    }
}