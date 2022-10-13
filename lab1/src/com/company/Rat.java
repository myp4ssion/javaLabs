package com.company;

public class Rat {
    private int gorun;
    private int goswim;
    static int ratCount = 0;

    public Rat(){
        ratCount++;
    }
    void run(int r){
        gorun = r;
        if(gorun > 60){
            System.out.println("Лариса пробежала только 60м");
        }else{
            System.out.println("Лариса пробежала " + gorun + "м");
        }
    }
    void swim(int s){
        goswim = s;
        if(goswim > 8){
            System.out.println("Лариса проплыла только 8м");
        }else{
            System.out.println("Лариса проплыла " + goswim + "м");
        }
    }
}
