package com.javaacademy.homework2.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner {
  public static void main(String[] args) {

    Item item1 = new Item("Яблоко");
    Item item2 = new Item("Банан");
    Item item3 = new Item("Апельсин");

    Map<Item, Integer> itemToInteger = new HashMap<>();

    itemToInteger.put(item1, 1);
    itemToInteger.put(item2, 2);
    itemToInteger.put(item3, 3);

    System.out.println("Значение по ключу Яблоко: " + itemToInteger.get(new Item("Яблоко")));
    System.out.println("Значение по ключу Банан: " + itemToInteger.get(new Item("Банан")));
    System.out.println("Значение по ключу Апельсин: " + itemToInteger.get(new Item("Апельсин")));



  }

}

