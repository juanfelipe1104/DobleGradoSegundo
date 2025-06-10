package com.utad.ds.factory.pets;

public class OverCatsPopulatedAnimalFactory implements AnimalFactory {
	public Animal factoryAnimalMethod(){
    	Animal randomAnimal;
    	double experimentoAleatorio = RandomAnimalFactory.getRandomDoubleBetweenRange(0, 100);
        if (experimentoAleatorio <= 30) {
            randomAnimal = new Dog();
        } 
        else {
        	randomAnimal = new Cat();
        }
        return randomAnimal;
	}
}