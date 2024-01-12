package com.javaacademy.homework1.task3;

public class Runner {
  public static void main(String[] args) {
    MagicStore magicStore = new MagicStore();
    magicStore.addItem(new Item("Ski"));
    magicStore.addItem(new Item("Book"));
    magicStore.addItem(new Item("TV"));
    magicStore.addItem(new Item("Box"));
    magicStore.addItem(new Item("Notebook"));

    System.out.println("Items into MagicStore: " + magicStore.getAllItems());
    System.out.println("Even Items into MagicStore: " + magicStore.getAllEvenItems());
    System.out.println("Get Item for index: " + magicStore.getByIndex(4));
    magicStore.keepLastItem();

    System.out.println("After remove: " + magicStore.getAllItems());
  }
}
