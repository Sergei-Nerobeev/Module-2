package com.javaacademy.homework4.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Runner {
  public static void main(String[] args) {
    Set<String> words = new HashSet<>(Arrays.asList("тонь", "тополь", "боль", "рой", "стройка"));
    long total = words
        .stream()
        .mapToInt(word -> Math.toIntExact(word.chars().filter(ch -> ch == 'о').count())).sum();

    if (total >0) {
      System.out.println("Количество букв 'о': " + total);
    } else {
      throw new RuntimeException("Буквы 'о' отсутствуют в наборе слов");
    }


  }



}
