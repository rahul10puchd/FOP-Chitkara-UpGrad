package com.upgrad.hello;

import java.util.Scanner;

public class Hello2021 {
    public static void main(String[] args) {
        // data (information) - available in different format
        // integer, float, char, boolean - true / false
        // keyword - int, float, boolean,double,char, true, false, // these cannot be used as variable name
        int number; // variable is just a name given to a bucket(data)  //
        number=10; // storage assign
        boolean flag=true;
//        System.out.println();
//        System.out.println(number);

//        char randomName;
//        randomName='H';
//        char variable='i';
//        //System.out.println(randomName+variable);
//        String greetings1="H";
//        String greetings2="i";
//        System.out.println(greetings1+greetings2);
//        String g1="Hi";
//        String g4= new String("Hello World");
//        char[] g2={'H','i'};// array is DS. which is used to store similar datatypes data
//        // ascii chart 56 -> 8
//        System.out.println(g1);
//        System.out.println(g2);
//        System.out.println(g1+g2.toString());
//        String t=g2.toString();
//        System.out.println(g1+t);
//        String temp= new String(g2);
//        System.out.println(g1+temp);
//
//        String g3="2021";
//        System.out.println(g1.length());
//        System.out.println(g1.concat(g4));
//        int count=1;
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter your number:  ");
        String countStr=myObj.nextLine();
        System.out.println(countStr);
        int count=Integer.parseInt(countStr);
        count=count+1;  // count =2
        count++;    //count=3 `// ++ dosent work with your String
        /* preIncrement=
        postIncrement=
        */
        System.out.println(count++);  // value to the function will be passed first then the count is incremented
        // updated to 4 i.e, count = 4
        System.out.println(++count); //first increment is happening then the value is getting passed to the function
        System.out.println(count);
    }
}
// primitive and Non-Primitive
// device driver - os uses for communication to the hardware
// command your OS to write something noto the console or screen(big code) ---> System class (inbuilt)