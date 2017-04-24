package com.gc.lab12;

/**
 * Created by maurice on 4/21/17.
 */
public class RockPlayer extends Player {

    public RockPlayer() {
        super.setName("Rock");
    }

    @Override
    public void generateRoshambo() {
        this.setRoshambo(Roshambo.ROCK);
    }
}
