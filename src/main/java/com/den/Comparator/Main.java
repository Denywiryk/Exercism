package com.den.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList();
        laptops.add(new Laptop(24, 2, "apple"));
        laptops.add(new Laptop(18, 4, "amazon"));
        laptops.add(new Laptop(2, 1, "del"));
        Comparator comparator = new Comparator<Laptop>(){

            @Override
            public int compare(Laptop lap1, Laptop lap2) {

                if (lap1.getRam()> lap2.getRam())
                    return 1;
                return -1;
            }
        } ;

        Collections.sort(laptops,comparator);
  for (Laptop lapi : laptops){
      System.out.println(lapi);
  }
    }


}
