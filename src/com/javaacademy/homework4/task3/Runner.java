package com.javaacademy.homework4.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
  public static void main(String[] args) {

    List<String> skyscrapers = Arrays.asList(
        "Всемирный торговый центр 1 - 541м",
        "Шанхайская башня - 632м",
        "Бурдж-Халифа - 828м",
        "Международный финансовый центр Пинань - 599м",
        "Абрадж аль-Бейт - 601м",
        "Всемирный центр Лотте - 555м",
        "Бурдж-Халифа - 828м"
    );

    List<String> uniqueSkyscrapers = skyscrapers
        .stream()
        .distinct()
        .collect(Collectors.toList());
    System.out.println("Уникальные небоскребы: " + uniqueSkyscrapers);

    List<String> firstThreeSkyscrapers = skyscrapers
        .stream()
        .limit(3)
        .collect(Collectors.toList());
    System.out.println("Первые три небоскреба: " + firstThreeSkyscrapers);
  }
}

