package com.den.InputOutput;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MonthsInYears = 12;
        final int totalPercentage = 100;
        int principle= 0;
        float monthlyInterest=0;
        int numberOfPayments =0;

        Scanner scanner = new Scanner(System.in);

while (true){
    System.out.println(" Principle:");
   principle = scanner.nextInt();
      if (principle>=1_000 && principle<=1_000_000);
      break;
}

      while (true) {
          System.out.println("Annual Interest Rate:");
          float annualInterest = scanner.nextFloat();
          if (annualInterest >= 1 && annualInterest <= 30)
          {
              monthlyInterest = (annualInterest / totalPercentage) / MonthsInYears;
              break;
          }
          System.out.println("Enter a value between 1 and 30");

      }
     while (true){
         System.out.println("Period in Years:");
         byte years = scanner.nextByte();
         if (years>= 1&& years<=30){
             numberOfPayments = years*MonthsInYears;
             break;
         }
         System.out.println("Enter  value between i and 30");
     }

         double mortgage = principle
                 *(monthlyInterest* Math.pow(1+monthlyInterest, numberOfPayments))
                  /(Math.pow(1+monthlyInterest,numberOfPayments)-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage = " + mortgageFormatted);
    }
}
