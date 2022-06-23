package com.den.AnnonymusInnerclasses;

public class ArmstrongNumbers {
    static boolean isArmstrongNumber(int number)
    {
        int temporary, digits=0, last=0, sum=0;
        temporary =number;
        while(temporary >0)
        {
            temporary = temporary /10;
            digits++;
        }
        temporary = number;
        while(temporary >0)
        {
            last = temporary % 10;
            sum +=  (Math.pow(last, digits));
            temporary = temporary /10;
        }
        if(number==sum)
            return true;

        else return false;
    }
    public static void  main(String args[])
    {
        System.out.println(  ArmstrongNumbers.isArmstrongNumber(150));


    }



}











