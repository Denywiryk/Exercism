package com.den.inheritance;

import java.util.*;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {
        // flat map deal with comples
        List<Integer> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(5,6);
     List<List<Integer>> finalList = Arrays.asList(list1, list3, list3);
        List<Integer> finalResults = finalList.stream()
                .flatMap(x -> x.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println("finalResults = " + finalResults);

        ///example two
         // distict () removes  dupulicated elements 


        List<String> teamA= Arrays.asList("john", "max", "kasango");
        List<String> teamB= Arrays.asList("teng", "wabwire", "smagola");
      List<String>teamC= Arrays.asList("ram", "denis", "dotman");

        List<List<String>> playerWoldCup = new  ArrayList<>();
          playerWoldCup.add(teamA);
          playerWoldCup.add(teamB);
          playerWoldCup.add(teamC);
          // before java 8 collections
        for (List<String> team : playerWoldCup){
            for (String name :team){
                System.out.println("name = " + name);
            }
        }
        // using java 8 concept
        List<String> name = playerWoldCup.stream().flatMap(plist -> plist.stream()).collect(Collectors.toList());
        System.out.println("playerWoldCup = " + name);



    }



    }

