package com.company;

public class Animal {
    int maxRunDistance;
    int maxSwimDistance;
    String name;
    String type;
    private static int animalsCount = 0;

    public Animal(String name, String type){
        this.name = name;
        this.type = type;
        animalsCount++;
    }

    public void swim(int swimDistance){
        if(maxSwimDistance > swimDistance){
            System.out.println(name + " проплыл " + swimDistance + " м");
        }else {
            System.out.println(name + " не смог проплыть " + swimDistance + " м");
        }
    }

    public void run(int runDistance){
        if(maxRunDistance > runDistance){
            System.out.println(name + " прекрасно справился с бегом на " + runDistance + " м");
        }else{
            System.out.println(name + " слишком слаб для такого забега на " + runDistance);
        }
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }
}
