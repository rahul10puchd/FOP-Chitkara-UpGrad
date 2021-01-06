package com.upgrad.function;

public class IntroFunctio {
    public static void main(String[] args) {
        String catchValueFromFunction;
        catchValueFromFunction = "hh";
        System.out.println(catchValueFromFunction);
        System.out.println(myFunction("2023","3032",10));   // System.out.println("All Statements are Executed");

// user-defined function .. inbuilt function
        int catchFunctionValueInt;
        catchFunctionValueInt=myFunctionInt();      //catchFunctionValueInt=100
        catchFunctionValueInt=catchFunctionValueInt*catchFunctionValueInt; //catchFunctionValueInt=10000
        System.out.println(catchFunctionValueInt);

        myFunctionVoid();


    }
    static String myFunction(String data, String secondData,int intData){
        System.out.println("Bye-Bye 2020..Please don't come again");
        System.out.println("Hello "+data+" "+secondData);
        System.out.println(intData*intData);
        myFunctionVoid();

        return "All Statements are Executed";   // to catch this it's upon us
    }
    // void notify that function not returning anydata
    static void myFunctionVoid(){
        System.out.println("I am returning void(nothing)");

    }
    static int myFunctionInt(){
        System.out.println("I am returning Int");
        return 100;   // to catch this it's upon us
    }
}
/*
returnTurn_Type function_Name(Parameter_Type Parameter_Variable_Name,....){
    statement-1;
    statement-2;
    ..
    ..
    ...
    ..
}
parameter
argument
 */
