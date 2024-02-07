package com.javaacademy.homework4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Runner {
  public static void main(String[] args) {

    List<Car> cars = Stream.concat(
                               IntStream.range(1, 50).mapToObj(number -> "a0" + String.format("%02d", number) + "ан799").map(Car::new),
                               IntStream.range(1, 50).mapToObj(number -> "a0" + String.format("%02d", number) + "се178").map(Car::new)
                               ).filter(car -> car.getNumber().matches(".*04[0-9].*"))
                              .toList();

    String result = cars.stream().map(Car::getNumber).collect(Collectors.joining(" ,"));
    System.out.println(result);

  }
}
