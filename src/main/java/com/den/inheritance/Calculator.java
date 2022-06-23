package com.den.inheritance;


import java.time.LocalTime;


public class Calculator {

    messages ms;
    LocalTime timeNow = LocalTime.now();


    LocalTime startTimeMorning;
    LocalTime endTimeMorning;
    LocalTime startTimeRestOfDay;
    LocalTime endTimeRestOfday;

    @Override
    public String toString() {
        return "Calculator{" +
                "ms=" + ms +
                ", timeNow=" + timeNow +
                ", startTimeMorning=" + startTimeMorning +
                ", endTimeMorning=" + endTimeMorning +
                ", startTimeRestOfDay=" + startTimeRestOfDay +
                ", endTimeRestOfday=" + endTimeRestOfday +
                '}';
    }

    //    LocalTime startTimeNight;
    public String massageBasedOnTime(String name) {


        startTimeMorning = LocalTime.parse("06:59:59");
        endTimeMorning = LocalTime.parse("11:59:59");

        startTimeRestOfDay = LocalTime.parse("11:59:59");
        endTimeRestOfday = LocalTime.parse("19:59:59");

//        startTimeNight = LocalTime.parse("19:59:59");
//        endTimeNight = LocalTime.parse("06:59:59");


        if (timeNow.isBefore(endTimeMorning) && timeNow.isAfter(startTimeMorning)) {
            return ms.morningMessages(name);

        } else if (timeNow.isBefore(endTimeRestOfday) && timeNow.isAfter(startTimeRestOfDay)) {
            return ms.restOfTheDayMessages(name);

        } else


            return ms.restOfTheDayMessages(name);
    }

    public boolean go() {

        startTimeMorning = LocalTime.parse("13:59:59");
        endTimeMorning = LocalTime.parse("18:59:59");

        if (timeNow.isBefore(endTimeMorning) && timeNow.isAfter(startTimeMorning)) {
            System.out.println("yeah world");

        } else System.out.println("iam fucked up");

        return  false;
    }

    public static void main(String[] args) {
        System.out.println(new Calculator().go());


    }


}