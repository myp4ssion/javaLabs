package com.company;

public class Tiger {
    private int gorun;
    private int goswim;
    static int tigerCount = 0;

    public Tiger(){
        tigerCount++;
    }
    void run(int r){
        gorun = r;
        if(gorun > 1500){
            System.out.println("Полосатик пробежал только 1500м");
        }else{
            System.out.println("Полосатик пробежал " + gorun + "м");
        }
    }
    void swim(int s){
        goswim = s;
        if(goswim > 40){
            System.out.println("Полосатик проплыл только 40м");
        }else{
            System.out.println("Полосатик проплыл " + goswim + "м");
        }
    }

}
