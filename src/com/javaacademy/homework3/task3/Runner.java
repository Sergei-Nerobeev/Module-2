package com.javaacademy.homework3.task3;

public class Runner {
  public static void main(String[] args) {

    FortuneTelling<String> daisyFortune = (name) -> (name.length() % 2 == 0) ? "да" : "нет";
    FortuneTelling<Human> grannyFortune = (human) -> {
      int total = human.getAge() + human.getHeight();
      return (total > 210) ? "да" : "нет";
    };

    String daisyResult = daisyFortune.predict("Иван");
    System.out.println("Гадание на ромашке: " + daisyResult);

    Human human = new Human(20,180);
    String grannyResult = grannyFortune.predict(human);
    System.out.println("Бабка гадалка: " + grannyResult);
  }
}
