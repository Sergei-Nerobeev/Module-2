package com.javaacademy.homework3.task2;

public class Runner {
  public static void main(String[] args) {

    Fruit apple = new Fruit();
    Fruit apricot = new Fruit();
    Garden appleFarm = (f1) -> System.out.println("Выросли яблоки!");
    Garden apricotFarm = (f2) -> System.out.println("Выросли абрикосы!");
    appleFarm.growFruits(apple);
    apricotFarm.growFruits(apricot);

  }
}
