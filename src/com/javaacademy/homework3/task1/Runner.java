package com.javaacademy.homework3.task1;

import java.util.Comparator;

import java.util.Set;
import java.util.TreeSet;

public class Runner {
  public static void main(String[] args) {

    Comparator<FeedBack> likeComparator = Comparator.comparingInt(FeedBack::getId);
    Set<FeedBack> feedBacks = new TreeSet<>(likeComparator);
    FeedBack feedBack1 = new FeedBack(1,"It is good item!",200);
    FeedBack feedBack2 = new FeedBack(2,"It is so-so item!",100);
    FeedBack feedBack3 = new FeedBack(3,"It is bad item!",100);
    feedBacks.add(feedBack1);
    feedBacks.add(feedBack2);
    feedBacks.add(feedBack3);
    for (FeedBack feedBack : feedBacks) {
      System.out.println(feedBack);
    }





  }
}
