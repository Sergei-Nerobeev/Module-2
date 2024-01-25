package com.javaacademy.homework2.task3;

import java.util.HashMap;
public class Runner {
  public static void main(String[] args) {

    HashMap<Detail,Integer> stringToInteger = new HashMap<>();
    Detail detail1 = new Detail("Saw");
    Detail detail2 = new Detail("Hummer");
    Detail detail3 = new Detail("Screwdriver");

    stringToInteger.put(detail1, 1);
    stringToInteger.put(detail1, 2);
    stringToInteger.put(detail1, 3);
    System.out.println(stringToInteger);
    System.out.println("********************************************");


    stringToInteger.put((new Detail("Saw")), 1);
    stringToInteger.put((new Detail("Hummer")), 2);
    stringToInteger.put((new Detail("Screwdriver")), 3);
    System.out.println(stringToInteger);
    System.out.println("********************************************");



  }
}
