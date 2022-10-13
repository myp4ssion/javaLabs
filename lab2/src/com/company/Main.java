package com.company;

import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Actions[] competitors = new Actions[]{
                new Human("Человек", 10, 10),
                new Cat("Котик", 10, 10),
                new Robot("Робот", 10, 10)};
        Actions[] var4 = competitors;
        int var5 = competitors.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Actions c = var4[var6];
            int n = 0;
            Barriers[] var8 = Barriers.values();
            int var9 = var8.length;

            for(int var10 = 0; var10 < var9; ++var10) {
                Barriers barriers = var8[var10];
                PrintStream var10000;
                String var10001;
                if (barriers.getDimension() <= c.getJumpHeight() && n < 4 && barriers.getType() == 1) {
                    var10000 = System.out;
                    var10001 = c.getName();
                    var10000.println(var10001 + " СМОГ преодолеть " + barriers.getTitle());
                } else if (barriers.getType() == 1) {
                    if (!c.super_jump()) {
                        var10000 = System.out;
                        var10001 = c.getName();
                        var10000.println(var10001 + " НЕ СМОГ преодолеть " + barriers.getTitle());
                        break;
                    }

                    var10000 = System.out;
                    var10001 = c.getName();
                    var10000.println(var10001 + " СМОГ преодолеть " + barriers.getTitle() + " с помошью СУПЕРПРЫЖКА");
                }

                ++n;
                if (barriers.getDimension() <= c.getRunDist() && n > 3 && barriers.getType() == 2) {
                    var10000 = System.out;
                    var10001 = c.getName();
                    var10000.println(var10001 + " СМОГ преодолеть " + barriers.getTitle());
                } else if (barriers.getType() == 2) {
                    var10000 = System.out;
                    var10001 = c.getName();
                    var10000.println(var10001 + " НЕ СМОГ преодолеть " + barriers.getTitle());
                    break;
                }
            }
        }
    }
}
