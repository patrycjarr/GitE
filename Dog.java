package com.company;

public class Dog {
    String name;
    private int numberOfLegs;

    public Dog(String name) {
        this(); //wywolanie konstruktowa domyslnego
        this.name = name;
    }

    public Dog() {
        this.numberOfLegs = 4;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void bark(){
        System.out.println("hauhau");
    }
    public static void sayHi(){
        System.out.println("hau");
    }
}
