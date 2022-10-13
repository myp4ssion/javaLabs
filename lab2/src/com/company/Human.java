package com.company;

public class Human extends MoreActions {
    private String name;
    private int runDist;
    private int jumpHeight;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDist = distance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return this.name;
    }

    public void run(int distance) {
        System.out.println("Человек " + this.name + " пробежал " + distance + " м");
    }

    public void jump(int height) {
        System.out.println("Человек " + this.name + " прыгнул на " + height + " м");
    }

    public int getRunDist() {
        return this.runDist;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }

}

