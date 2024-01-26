package com.javaacademy.homework3.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class FeedBack {
  private Long id;
  private String text;
  private Long likeQuantity;
  public Date  date;

  public FeedBack(Long id, String text, Long likeQuantity) {
    this.id = id;
    this.text = text;
    this.likeQuantity = likeQuantity;
    this.date = new Date();

  }

  public Long getId() {
    return id;
  }
  public Long getLikeQuantity() {
    return likeQuantity;
  }
  public Date getDate() {
    return date;
  }

  @Override
  public String toString() {
    return
        "{id: " + id + ", "+ text + ", "  + likeQuantity + ", " + date + '}';
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    FeedBack feedBack = (FeedBack) object;
    return Objects.equals(id, feedBack.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
