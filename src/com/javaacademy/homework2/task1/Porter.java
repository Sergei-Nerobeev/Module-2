package com.javaacademy.homework2.task1;

public class Porter {
  private String name;

  public Porter(String name) {
    this.name = name;
  }

  public void trowBaggageWithShout(SuitCase suitCase) {

    System.out.println(name + ": " + "Guys I'm throwing a suitcase! " + suitCase.getFlightNumber());

  }

  public String getName() {
    return name;
  }
}
