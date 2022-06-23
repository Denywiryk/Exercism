package com.den.ComparableAndComparator;

import com.den.Comparator.Laptop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> lap = new ArrayList();
        lap.add(new Laptop(24, 2, "apple"));
        lap.add(new Laptop(18, 4, "amazon"));
        lap.add(new Laptop(2, 1, "del"));
  for (Laptop lapi : lap){
      System.out.println(lapi);
  }
    }


}
