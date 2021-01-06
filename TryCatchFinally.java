package com.upgrad.error;

public class TryCatchFinally {
    public static void main(String[] args) {
        int one=1;
        int zero=0;
        int result;
        try{
            result=one/zero;    //
            System.out.println(result);
//            try{
//                result=one/zero;       // expression one/zero -> giving error
//
//            }catch(Exception e){
//                System.out.println("This one is nested");
//            }

        }
        catch(NullPointerException e){
            System.out.println("Code fatt gya hai..apna dekh lo bhai aake");
        }catch(ArithmeticException e){
            System.out.println("Code fatt gya hai..apna dekh lo bhai aake");
        }finally {
            System.out.println("Jai mata di");
        }
        System.out.println("Hello Bhaiiii");
//        try{
//            result=one/zero;       // expression one/zero -> giving error
//
//        }catch(Exception e){
//            System.out.println("Fir bhi nhi chala bhai");
//        }

//        System.out.println(result);
    }
}
