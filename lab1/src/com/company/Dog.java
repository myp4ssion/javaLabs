package com.company;

public class Dog {
    private int gorun;
    private int goswim;
    private String name;
    static int dogCount = 0;

    public Dog(){
        dogCount++;
    }
    void run(int r, String n){
        gorun = r;
        name = n;
        if(gorun > 500){
            System.out.println(name +" пробежал только 500м");
        }else{
            System.out.println(name +" пробежал " + gorun + "м");
        }
    }
    void swim(int s, String n){
        name = n;
        goswim = s;
        if(goswim > 10){
            System.out.println(name +" проплыл только 10м");
        }else{
            System.out.println(name +" проплыл " + goswim + "м");
        }
    }

}
