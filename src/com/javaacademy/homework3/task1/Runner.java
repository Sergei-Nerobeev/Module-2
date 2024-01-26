package com.javaacademy.homework3.task1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Runner {
  public static void main(String[] args) {

    Set<FeedBack> feedBacks = new HashSet<>();
    FeedBack feedBack1 = new FeedBack(1L,"It is good item!",200L);
    FeedBack feedBack2 = new FeedBack(2L,"It is so-so item!",100L);
    FeedBack feedBack3 = new FeedBack(3L,"It is bad item!",100L);
    feedBacks.add(feedBack1);
    feedBacks.add(feedBack2);
    feedBacks.add(feedBack3);
    Comparator<FeedBack> sortLikes =



//    feedBacks.add(new FeedBack(1L,"It is good item!",200L));
//    feedBacks.add(new FeedBack(2L,"It is so-so item!",100L));
//    feedBacks.add(new FeedBack(3L,"It is bad item!",100L));
//    System.out.println(feedBacks);


  }
}
