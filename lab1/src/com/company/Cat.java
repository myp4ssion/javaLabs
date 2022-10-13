package com.company;

public class Cat {
    private int gorun;
    private int goswim;
    static int catCount = 0;

    public Cat(){
        catCount++;
    }
    void run(int r){
        gorun = r;
        if(gorun > 200){
            System.out.println("Мурзик пробежал только 200м");
        }else{
            System.out.println("Мурзик пробежал " + gorun + "м");
        }
    }
    void swim(int s){
        goswim = s;
        if(goswim > 0){
            System.out.println("Увы, но мурзик не умеет плавать");
        }else{
            System.out.println("Мурзик проплыл 0м, ведь он не умеет плавать");
        }
    }
}
