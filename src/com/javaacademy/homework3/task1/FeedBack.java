package com.javaacademy.homework3.task1;

import java.util.Objects;

public class FeedBack {
  private int id;
  private String text;
  private int likeQuantity;
  public Date date;

  public FeedBack(int id, String text, int likeQuantity) {
    this.id = id;
    this.text = text;
    this.likeQuantity = likeQuantity;
    this.date = new Date();

  }

  public int getId() {
    return id;
  }

  public int getLikeQuantity() {
    return likeQuantity;
  }

  public Date getDate() {
    return date;
  }

  @Override
  public String toString() {
    return
        "{id: " + id + ", " + text + ", " + likeQuantity + ", " + date + '}';
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
