package com.javaacademy.homework2.task1;

import java.util.ArrayList;

public class BaggageArea {
  private int maxLoad;
  private ArrayList<SuitCase> suitCases;
  private ArrayList<Porter> porters;

  public BaggageArea() {
    this.maxLoad = 20;
    suitCases = new ArrayList<>();
    porters = new ArrayList<>();
    porters.add(new Porter("John"));
    porters.add(new Porter("Dan"));
    porters.add(new Porter("Tommy"));
  }

  public void plainArrival(String flightNumber) {
    for (int i = 0; i < maxLoad; i++) {
      SuitCase suitCase = new SuitCase(flightNumber);
      suitCases.add(suitCase);
    }
  }

  public void unloadBaggage2() { //  TODO
    int flightIndex = 0;
    for (int i = 0; i < suitCases.size(); i++) {
      Porter porter = porters.get(i % porters.size());
      SuitCase suitcase = suitCases.get(i);
      porter.trowBaggageWithShout(suitcase);
      if ((i + 1) % porters.size() == 0) {
        flightIndex++;
      }
    }
  }
}



