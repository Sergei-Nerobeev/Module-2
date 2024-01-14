package com.javaacademy.homework1.task2;

import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    ArrayList<Integer> first = new ArrayList<>();
    first.add(5);
    first.add(2);
    first.add(4);

    ArrayList<Integer> second = new ArrayList<>();
    second.add(7);
    second.add(10);

    ArrayList<Integer> total = new ArrayList<>();
    total.addAll(first);
    total.addAll(second);
    System.out.println(total);
    total.remove(2);
    System.out.println(total.indexOf(10));

  }
}
