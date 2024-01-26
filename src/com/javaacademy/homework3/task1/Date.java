package com.javaacademy.homework3.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
  private LocalDateTime localDateTime;
  private DateTimeFormatter dateTimeFormatter;
  private String date;

  public Date() {
    this.localDateTime = LocalDateTime.now();
    this.dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    this.date = localDateTime.format(dateTimeFormatter);
  }

  @Override
  public String toString() {
    return date;
  }
}
