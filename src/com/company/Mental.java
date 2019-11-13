package com.company;

public class Mental extends Player {
    private int MentalHit;

    public int getMentalHit() {
        return MentalHit;
    }

    public void setMentalHit(int mentalHit) {
        MentalHit = mentalHit;
    }

    public Mental(int health, int damage) {
        super.helth=health;
        super.demage=damage;

}


    @Override
    public void sayWord() {
        System.out.println("   Mental ");

    }
    public void mentalHit() {
        super.setDemage(super.getDemage() + MentalHit);
    }

    @Override
    public void printInfo() {
        System.out.println("Mental health:"+ super.getHealth()+"damage:"+super.getDemage()+" Mental Hit"+getMentalHit());

    }
}
