package com.javaacademy.homework1.task1;

public class Runner {
  public static void main(String[] args) {
    Tiger tiger = new Tiger();
    Dog dog = new Dog();
    Bird bird = new Bird();

    Zoo<Animal> zoo = new Zoo<>(tiger, dog, bird);
    zoo.actions();
  }
}
