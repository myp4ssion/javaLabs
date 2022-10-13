package com.company;

public class Robot extends MoreActions implements SuperJump {
    private String name;
    private int runDist;
    private int jumpHeight;
    private int SuperJumpCount = 2;

    public Robot(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDist = distance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return this.name;
    }

    public void run(int distance) {
        System.out.println("Робот " + this.name + " пробежал " + distance + " м");
    }

    public void jump(int height) {
        System.out.println("Робот " + this.name + " прыгнул на " + height + " м");
    }

    public int getRunDist() {
        return this.runDist;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }

    public boolean super_jump() {
        if (this.SuperJumpCount > 0) {
            --this.SuperJumpCount;
            return true;
        } else {
            return false;
        }
    }
}