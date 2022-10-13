package com.company;

public class Main {

    public static void main(String[] args) {
        int runDistance = 200;
        int swimDistance = 50;
        Animal cat1 = new Cat(50,100,"Барсик", "Кот");
        Dog dog1 = new Dog(200,100, "Бобик", "Собака");
        Tiger tiger1 = new Tiger(500, 300,"Полосатик", "Тигр");
        Animal[] animals = new Animal[]{cat1, dog1, tiger1, new Dog(100, 50, "Зевс", "Собака")};
        for (Animal animal : animals) {
            animal.swim(swimDistance);
            animal.run(runDistance);
        }
        System.out.println(Animal.getAnimalsCount() + " - количество животных");
        System.out.println(Dog.getDogCount() + " - количество собак");
        System.out.println(Cat.getCatCount() + " - количество котов");
        System.out.println(Tiger.getTigerCount() + " - количество тигров");
    }
}
