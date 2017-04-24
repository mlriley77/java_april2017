package com.gc.lab12;

import java.util.Random;

/**
 * Created by maurice on 4/21/17.
 */
public class AIPlayer extends Player {

    public AIPlayer() {
        super.setName("Random Player");
    }

    @Override
    public void generateRoshambo() {
        Random r = new Random();
        int choice = r.nextInt(3);
        this.setRoshambo(Roshambo.values()[choice]);
    }
}
