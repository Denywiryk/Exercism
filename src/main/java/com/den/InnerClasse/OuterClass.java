package com.den.InnerClasse;

public class OuterClass {
    int num = 6;
    public InnerClass innerClass;
    public  void greet(){
        System.out.println("hey there");
    }
    public static class InnerClass{
        int num = 23;
        public void hello(){
            System.out.println("inner claa metthod");
        }
    }


}
