package com.company;

public abstract class Player {

    int helth;
    int demage;

    protected int getHealth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }
    public abstract  void sayWord();
    public abstract  void printInfo();

}
