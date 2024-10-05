package com.example.the_table.Turn;

public class Turn {
    private int currentTurn;
    private int loopSize;

    public Turn(int loopSize) {
        this.currentTurn = 0;
        this.loopSize = loopSize;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public int getLoopSize() {
        return loopSize;
    }

    public boolean next() {
        if (currentTurn == loopSize - 1) {
            currentTurn = 0;
            return true;
        }

        currentTurn++;
        return true;
    }
}
