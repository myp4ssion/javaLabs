package com.company;

import java.util.Random;

public class Main {
/*Животные: собака, кот, тигр, белка, крыса.*/
/*Ограничения по препятствиям*/
/*Собака: бег - 500м, плавание - 10м*/
/*Кот: бег - 200м, плавание - кот не умеет плавать*/
/*Тигр: бег - 1500м, плавание - 40м*/
/*Белка: бег - 80м, плавание - 4м*/
/*Крыса: бег - 60м, плавание - 8м*/
    public static void main(String[] args) {

        Dog dogBobik = new Dog();
        Cat catMurzik = new Cat();
        Tiger tigerPolosatik = new Tiger();
        Squerel squerelBelka = new Squerel();
        Rat ratLarisa = new Rat();

        dogBobik.run(250, "Бобик");
        dogBobik.swim(8, "Бобик");

        catMurzik.run(100);
        catMurzik.swim(0);

        tigerPolosatik.run(750);
        tigerPolosatik.swim(20);

        squerelBelka.run(40);
        squerelBelka.swim(2);

        ratLarisa.run(30);
        ratLarisa.run(4);


        int n = 10;
        Random random = new Random();
        Dog [] dogs = new Dog [n];
        for (int i = 0; i < n; i++){
            dogs [i] = new Dog();
            dogBobik.run(random.nextInt(800),Integer.toString(i));
            dogBobik.swim(random.nextInt(15),Integer.toString(i));
        }
        System.out.println(Dog.dogCount + " собак создано");
        System.out.println(Cat.catCount + " кошек создано");
        System.out.println(Tiger.tigerCount + " тигров создано");
        System.out.println(Squerel.squerelCount + " белок создано");
        System.out.println(Rat.ratCount + " крыс создано");

        System.out.println(Dog.dogCount + Cat.catCount + Tiger.tigerCount + Squerel.squerelCount + Rat.ratCount + " всего животных создано");

    }
}
