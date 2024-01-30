package com.javaacademy.homework3.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
  public static void main(String[] args) {

    Comparator<FeedBack> likeComparator = (f1, f2) -> {
      if (f1.getLikeQuantity() != f2.getLikeQuantity()) {
        return f2.getLikeQuantity() - f1.getLikeQuantity();
      }
      else {
        return f2.getDate().getLocalDateTime().compareTo(f1.getDate().getLocalDateTime());
      }
    };
    List<FeedBack> feedBacks = new ArrayList<>();
    FeedBack feedBack1 = new FeedBack(1, "It is good item!", 200);
    FeedBack feedBack2 = new FeedBack(2, "It is so-so item!", 100);
    FeedBack feedBack3 = new FeedBack(3, "It is bad item!", 100);
    feedBacks.add(feedBack1);
    feedBacks.add(feedBack2);
    feedBacks.add(feedBack3);

    feedBacks.sort(likeComparator);
    for (FeedBack feedBack : feedBacks) {
      System.out.println(feedBack);
    }

  }
}
