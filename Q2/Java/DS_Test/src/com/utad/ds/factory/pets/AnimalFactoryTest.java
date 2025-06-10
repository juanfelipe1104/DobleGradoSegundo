package com.utad.ds.factory.pets;

public class AnimalFactoryTest {
	public static void createAnimals(Animal[] animals, AnimalFactory animalFactory) {
		Integer maxAnimals = 100, dogCount = 0, catCount = 0;
		for(int i = 0; i < maxAnimals; i++) {
			animals[i] = animalFactory.factoryAnimalMethod();
			if(animals[i] instanceof Dog) {
				dogCount++;
			}
			else {
				catCount++;
			}
		}
		System.out.println("Dogs (" + dogCount + "), Cats (" + catCount + ")");
	}
	public static void main(String[] args) {
		Animal[] animals = new Animal[100];
		AnimalFactory animalFactory = new RandomAnimalFactory();
		AnimalFactoryTest.createAnimals(animals, animalFactory);
		animalFactory = new OverCatsPopulatedAnimalFactory();
		AnimalFactoryTest.createAnimals(animals, animalFactory);
	}
}
