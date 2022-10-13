package com.company;

public class Squerel {
    private int gorun;
    private int goswim;
    static int squerelCount = 0;

    public Squerel(){
        squerelCount++;
    }
    void run(int r){
        gorun = r;
        if(gorun > 80){
            System.out.println("Белка пробежала только 80м");
        }else{
            System.out.println("Белка пробежала " + gorun + "м");
        }
    }
    void swim(int s){
        goswim = s;
        if(goswim > 4){
            System.out.println("Белка проплыла только 4м");
        }else{
            System.out.println("Белка проплыла " + goswim + "м");
        }
    }
}
