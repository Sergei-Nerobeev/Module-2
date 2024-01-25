package com.javaacademy.homework2.task2;

import java.util.Objects;

public class Item {
  private String name;

  public Item(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Item item = (Item) object;
    return Objects.equals(name, item.name);
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    return name;
  }

}
