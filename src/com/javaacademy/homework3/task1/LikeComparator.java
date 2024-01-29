package com.javaacademy.homework3.task1;

import java.util.Comparator;

public class LikeComparator implements Comparator<FeedBack> {
  @Override
  public int compare(FeedBack o1, FeedBack o2) {
    return Integer.compare(o1.getId(),o2.getId());
  }
}
