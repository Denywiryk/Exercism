package com.den;

public class SingleTon {
private static SingleTon innstance;
    private SingleTon() {
    }

    public static SingleTon getInnstance(){
        if (innstance == null){
            innstance = new SingleTon();

        }
        return innstance;


    }
}
