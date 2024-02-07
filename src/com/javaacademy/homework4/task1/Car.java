package com.javaacademy.homework4.task1;

public class Car {
private String number;

  public Car(String number) {
    this.number = number;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return  number;

  }
}
