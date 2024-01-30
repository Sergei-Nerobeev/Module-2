package com.javaacademy.homework3.task3;
@FunctionalInterface
public interface FortuneTelling<T> {
  String predict(T input);
}
