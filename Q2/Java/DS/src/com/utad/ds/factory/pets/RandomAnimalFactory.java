package com.utad.ds.factory.pets;

public class RandomAnimalFactory implements AnimalFactory {
    public static double getRandomDoubleBetweenRange(double min, double max) {
        return (Math.random() * (max - min)) + min;
    }
    public Animal factoryAnimalMethod() {
        Animal randomAnimal;
        double experimentoAleatorio = RandomAnimalFactory.getRandomDoubleBetweenRange(0, 100);
        if (experimentoAleatorio >= 50) {
            randomAnimal = new Dog();
        } 
        else {
            randomAnimal = new Cat();
        }
        return randomAnimal;
    }
}