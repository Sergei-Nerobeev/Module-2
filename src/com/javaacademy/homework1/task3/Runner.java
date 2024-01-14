package com.javaacademy.homework1.task3;

import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {

    MagicStore magicStore = new MagicStore();
    magicStore.addItem(new Item("Ski"));
    magicStore.addItem(new Item("Book"));
    magicStore.addItem(new Item("TV"));
    magicStore.addItem(new Item("Box"));
    magicStore.addItem(new Item("Notebook"));

    ArrayList<Item> items = new ArrayList<>();
    items.add(new Item("Guitar"));
    items.add(new Item("Desk"));
    items.add(new Item("PC"));

    magicStore.addItems(items);

    System.out.println("Items into MagicStore: " + magicStore.getAllItems());
    System.out.println("Even Items into MagicStore: " + magicStore.getAllEvenItems());
    System.out.println("Get Item for index: " + magicStore.getByIndex(4));
    magicStore.keepLastItem();

    System.out.println("After remove: " + magicStore.getAllItems());
    System.out.println("All even after: " + magicStore.getAllEvenItems());
  }
}
