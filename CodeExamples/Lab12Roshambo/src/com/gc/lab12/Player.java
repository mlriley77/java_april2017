package com.gc.lab12;

import java.util.Comparator;

/**
 * Created by maurice on 4/21/17.
 */
public abstract class Player implements Comparator {
    private String name;

    private Roshambo roshambo;

    //abstract method to generate roshambo value. Implemented in child class
    public abstract void generateRoshambo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Roshambo getRoshambo() {
        return roshambo;
    }

    public void setRoshambo(Roshambo roshambo) {
        this.roshambo = roshambo;
    }


    @Override
    public int compare(Object object1, Object object2) {
        //special cases conditional block
        if((Roshambo)object1 == Roshambo.SCISSORS && (Roshambo)object2 == Roshambo.PAPER){
            return 1;
        }else if((Roshambo)object2 == Roshambo.PAPER && (Roshambo)object1 == Roshambo.SCISSORS){
            return -1;
        }else if((Roshambo)object1 == Roshambo.ROCK && (Roshambo)object2 == Roshambo.SCISSORS){
            return 1;
        }else if((Roshambo)object1 == Roshambo.SCISSORS && (Roshambo)object2 == Roshambo.ROCK){
            return -1;
        }
        return ((Roshambo)object1).compareTo((Roshambo)object2);//non special cases compare
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", roshambo=" + roshambo +
                '}';
    }
}
