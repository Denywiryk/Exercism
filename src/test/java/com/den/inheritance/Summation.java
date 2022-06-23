package com.den.inheritance;

public class Summation {

    public  int add (int num1,int num2){

    return  num1+ num2;
    }
 // iam trying to find  a palidrom
    public boolean isPall(String str) {
        String reverse ="";
        int length = str.length();
        for(int i=length -1;i>=0; i--) {
            reverse= reverse + str.charAt(i) ;
        }
        if (str.equals(reverse)){
            return true;
        }else
            return  false;

    }

}
