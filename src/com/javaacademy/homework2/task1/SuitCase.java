package com.javaacademy.homework2.task1;

public class SuitCase {
  private String flightNumber;

  public SuitCase(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  @Override
  public String toString() {
    return flightNumber;
  }
}
