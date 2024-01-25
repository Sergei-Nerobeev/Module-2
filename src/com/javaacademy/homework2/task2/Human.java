package com.javaacademy.homework2.task2;

import java.util.Objects;

public class Human {
  private String name;

  public Human(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Human human = (Human) object;
    return Objects.equals(name, human.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return name;
  }
}
