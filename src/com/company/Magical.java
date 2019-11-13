package com.company;

public class Magical extends Player {
private int magicalHit;

    public int getMagicalHit() {
        return magicalHit;
    }

    public void setMagicalHit(int magicalHit) {
        this.magicalHit = magicalHit;
    }

    public Magical(int health, int damage) {
        super.helth=health;
        super.demage=damage;
    }

    @Override
    public void sayWord() {
        System.out.println(" Magical");

    }
    public void magicalHit(){
        super.setDemage(super.getDemage()+magicalHit);
    }

    @Override
    public void printInfo() {
        System.out.println("Magical health:"+ super.getHealth()+"damage:"+super.getDemage()+" Magical hit"+getMagicalHit());
    }
}


