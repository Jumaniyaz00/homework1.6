package com.company;

import java.util.Random;

public class Boss extends Player {
    private  int defence;

    public Boss(int health,int damage) {
        super.helth=health;
        super.demage=damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
    public void changeBossDefence(){
        Random r = new Random();
        int randomNom = r.nextInt(3) +1;
        setDemage(randomNom);
    }
    @Override
    public void sayWord() {
        System.out.println(" waaaaw");

    }

    @Override
    public void printInfo() {
        System.out.println("Boss health:"+ super.getHealth()+"damage:"+super.getDemage()+" defence"+getDefence());

    }

}
