package com.javaacademy.homework2.task3;

import java.util.Objects;

public class Detail {
  private String name;

  public Detail(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object object) {
    return true;
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
