package model.impl;

import model.api.Dice;
import java.util.Random;

public class DiceImpl implements Dice{

    private int numDice;
    private Random random;

    public DiceImpl(int numDice) {
        this.numDice = numDice;
        this.random = new Random();
    }

    @Override
    public int rollDice() {
        int total = 0;
        for(int i = 0; i < numDice; i++) {
            total += random.nextInt(1, 7);
        }
        return total;
    }


    @Override
    public int getNumDice() {
        return numDice;
    }

    
}