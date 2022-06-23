package com.den.InputOutput2;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private String StudentId;
    private String courses = null;
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    public static int id = 1000;


    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your firstName:");
        this.firstName = scanner.nextLine();

        System.out.print("Enter your  lastName:");
        this.lastName = scanner.nextLine();

        System.out.print("1 -Freshmen\n2 - Sophmore\n3 -junior\n4 -senior\nEnter Student-class-level:");
        this.gradeYear = scanner.nextLine();
        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + StudentId);


    }

    public void setStudentId() {
        id++;
        StudentId = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.println("ENTER COURSE TO ENROLL(Q to quit) ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Quit" )){

            courses = courses + "\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
            break;
        }else{break;}
        }
        while (true) ;
            System.out.println("ENROLLED IN " + courses);
            System.out.println("TUITION BALANCE " + tuitionBalance);



    }
}



