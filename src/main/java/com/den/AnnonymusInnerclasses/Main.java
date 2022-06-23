package com.den.AnnonymusInnerclasses;

public class Main {
    public static void main(String[] args) {
        ArmstrongNumbers animal = new ArmstrongNumbers() {
            public void makeSound() {
                System.out.println("hello");
            }


        };

     //   animal.makeSound();
        // case with interfaces

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("hell my people");
            }
        };
        runnable.run();
    }


}
