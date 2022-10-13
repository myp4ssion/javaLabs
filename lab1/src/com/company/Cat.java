package com.company;

public class Cat extends Animal {
    private static int catCount = 0;
    public Cat(int maxRunDistance, int maxSwimDistance, String name, String type){
        super(name, type);
        this.maxSwimDistance = maxSwimDistance;
        this.maxRunDistance = maxRunDistance;
        catCount++;
    }

    @Override
    public void swim(int swimDistance){
        System.out.println(name + " не умеет плавать");
    }

    public static int getCatCount() {
        return catCount;
    }
}
