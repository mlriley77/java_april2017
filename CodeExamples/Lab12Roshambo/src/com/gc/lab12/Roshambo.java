package com.gc.lab12;

/**
 * Created by maurice on 4/22/17.
 */
public enum Roshambo {
    ROCK, PAPER, SCISSORS;


    @Override
    public String toString() {
        String temp = null;
        switch (this) {
            case ROCK:
                temp = "The Rock";
                break;

            case PAPER:
                temp = "Cool Paper";
                break;

            case SCISSORS:
                temp = "Cut to the bone Scissors";
                break;

            default:
                break;
        }
        return temp;
    }
}
