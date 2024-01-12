package com.javaacademy.homework1.task1;

public class Zoo<T extends Animal> {
  private T animal1;
  private T animal2;
  private T animal3;

  public Zoo(T animal1, T animal2, T animal3) {
    this.animal1 = animal1;
    this.animal2 = animal2;
    this.animal3 = animal3;
  }

  public void actions() {
    animal1.action();
    animal2.action();
    animal3.action();

  }
}




