package com.javaacademy.homework1.task3;

import java.util.ArrayList;

public class MagicStore {
  private ArrayList<Item> items;

  public MagicStore() {
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    items.add(item);

  }

  public void addItems(ArrayList<Item> items) {
    items.addAll(items);
  }

  public ArrayList<Item> getAllItems() {
    return new ArrayList<>(items);
  }

  public ArrayList<Item> getAllEvenItems() {
    ArrayList<Item> evenItem = new ArrayList<>();
    for (int i = 0; i < items.size(); i += 2) {
      evenItem.add(items.get(i));
    }
    return evenItem;
  }

  public Item getByIndex(int index) {
    if (index >= 0 && index < items.size()) {
      return items.remove(index);
    }
    else {
      return null;
    }
  }

  public void keepLastItem() {
    if (items.size() > 1) {
      items.subList(0, items.size() - 1).clear();
    }
  }

}
