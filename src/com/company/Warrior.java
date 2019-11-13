package com.company;

public class Warrior extends Player {
    private int physicalHit;

    public Warrior(int health, int damage) {
        super.helth = health;
        super.demage = damage;
    }

    public int getPhysicalHit() {
        return physicalHit;
    }

    public void setPhysicalHit(int physicalHit) {
        this.physicalHit = physicalHit;
    }
    public void warriorHit(){
        super.setDemage(super.getDemage()+physicalHit);
    }


    @Override
    public void sayWord() {
        System.out.println(" Warior");
    }

    @Override
    public void printInfo() {
        System.out.println("Warrior health:" + super.getHealth() + "damage:" + super.getDemage() + " physica Hit" + getPhysicalHit());

    }
}
