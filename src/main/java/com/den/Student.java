package com.den;

public class Student {

    int rolno ;
    String name ;
    float  marks;


// i camn change permanent input by using a method having an input
// if i want the objects to have the same values i have to asighn values stativcally from the the conwstructor
// calling a constructor from another  contructor
  /*com.den.Student(){
      this ( 12, "bad dem", 34.23f);


  }*/


   public   void  changeName(String name){
       this.name = name;
   }
    Student() {
        this.rolno = 25;
        this.name = "kako";
        this.marks = 88.4F;
    }

    Student(int rolno, String name, float marks) {
        this.rolno = rolno;
        this.name = name;
        this.marks = marks;
    }
 void  greeting(){
     System.out.println("iam ok");
 }
    }

