package com.company;

public class Tiger extends Animal{
    private static int tigerCount = 0;
    public Tiger(int maxRunDistance, int maxSwimDistance, String name, String type){
        super(name, type);
        this.maxSwimDistance = maxSwimDistance;
        this.maxRunDistance = maxRunDistance;
        tigerCount++;
    }

    public static int getTigerCount() {
        return tigerCount;
    }
}
