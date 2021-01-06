package com.upgrad.lambda;

import java.util.ArrayList;

public class ForEachLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        // numbers = [5,9,8,1]

        numbers.forEach( (abc) -> { System.out.println(abc);System.out.println(abc+abc); } );
        for (int num:numbers){
            System.out.println(num);
        }
    }
}

/*
    (parameter) -> expression
    parameter -> { statements-1; statements-2;}
    (parametr-1,parameter-2) -> expression
    (parametr-1,parameter-2) -> { statements-1; statements-2;}

    forEach - iterate over the array[]
    for(int i=0;i<number.length;i++)
    {
        numbers[i]
    }
    method vs function
 */
