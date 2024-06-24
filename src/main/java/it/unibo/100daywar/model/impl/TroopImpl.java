package model.impl;

import model.api.Board;
import model.api.Dice;
import model.api.Troop;
import model.util.Position;

public class TroopImpl implements Troop{

    // Attributi esistenti
    private int id;
    private String name;
    private int energy;
    private int maxEnergy;
    private Position position;
    private int playerId;
    private int diceCount;

    // Nuovo attributo per il dado
    private Dice dice;

    public TroopImpl(int id, String name, int maxEnergy, Position position, int playerId) {
        this.id = id;
        this.name = name;
        this.maxEnergy = maxEnergy;
        this.energy = maxEnergy;
        this.position = position;
        this.playerId = playerId;
        this.diceCount = 3;  // Imposta un valore predefinito per i dadi
        this.dice = new DiceImpl(diceCount);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public int getMaxEnergy() {
        return maxEnergy;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public int getPlayerId() {
        return playerId;
    }

    @Override
    public int getDiceCount() {
        return dice.getNumDice();
    }

    @Override
    public void move(Position newPosition) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void attack(Troop opponent) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    @Override
    public void defend() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defend'");
    }

    @Override
    public void receiveEnergy(int amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveEnergy'");
    }

    @Override
    public boolean isIsolated(Board board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isIsolated'");
    }

     
}