package com.javaacademy.homework3.task5;

public class Runner {
  public static void main(String[] args) {

    Line<Boat> boatLenght = (name) -> (name.getLength());
    int resultBoatLine = boatLenght.predict(new Boat(20));
    System.out.println(resultBoatLine);

    Line<Animal> animalTotalLenght = (animal) -> animal.getLenghtBody() + animal.getLenghtTail();
    int totalAnimalLenghts = animalTotalLenght.predict(new Animal(10, 30));
    System.out.println(totalAnimalLenghts);

  }
}

