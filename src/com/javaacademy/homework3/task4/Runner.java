package com.javaacademy.homework3.task4;

public class Runner {
  public static void main(String[] args) {

    Burning bonfire = (tree) -> System.out.println("Желто-красный свет вокруг!");
    Burning reactor = (uran) -> System.out.println("Зеленый свет вокруг!");

    bonfire.fireAll("tree");
    reactor.fireAll("uranium");

  }
}
