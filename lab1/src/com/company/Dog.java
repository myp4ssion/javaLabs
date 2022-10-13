package com.company;

public class Dog extends Animal{
    private static int dogCount = 0;
    public Dog(int maxRunDistance, int maxSwimDistance, String name, String type){
        super(name, type);
        this.maxSwimDistance = maxSwimDistance;
        this.maxRunDistance = maxRunDistance;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
