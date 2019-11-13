package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(500, 50);
        boss.printInfo();
        boss.sayWord();
        boss.changeBossDefence();
        Magical magical = new Magical(303, 30);
        Warrior warrior = new Warrior(400, 44);
        Mental mental = new Mental(400, 40);
        int num=boss.getDefence();
        switch (num){
            case 1:
                magical.setMagicalHit(10);
                magical.magicalHit();
                break;
            case 2:
                warrior.setPhysicalHit(30);
                warrior.warriorHit();
                break;
            case 3:
                mental.setMentalHit(40);
                mental.mentalHit();
                break;

        }
        magical.printInfo();
        magical.sayWord();

        warrior.printInfo();
        warrior.sayWord();

        mental.printInfo();
        mental.sayWord();


    }
}
