package com.upgrad.map;

import java.util.HashMap;
import java.util.Hashtable;

public class ExOfHashTable {
    public static void main(String[] args) {
        // Hashtable<Key_DataType,Value_DataType> VariableName=new Hashtable<KEY_DataType, Value_DataType>();
//        Hashtable<String,Integer> phoneBook=new Hashtable<String, Integer>();
//        phoneBook.put("Aditya",999999999);
//        phoneBook.put("Sanskar",2289107);
//        phoneBook.put(null,12345);
//        System.out.println(phoneBook.get("Aditya"));
//        if(phoneBook.contains(2289107)){
//            System.out.println("number 2289107 found");
//        }
//        if(phoneBook.containsKey("Aditya")){
//            System.out.println("We got Aditya");
//        }
//        if(phoneBook.containsKey(999999999)){
//            System.out.println("esa bhi hota hai kya");
//        }else{
//            System.out.println("ye kya kar diya");
//        }
        HashMap<String,Integer> phoneBook=new HashMap<String, Integer>();
        phoneBook.put("Aditya",999999999);
        phoneBook.put("Sanskar",2289107);

        phoneBook.put(null,12345);
        System.out.println(phoneBook.get("Aditya"));
        if(phoneBook.containsValue(2289107)){
            System.out.println("number 2289107 found");
        }
        if(phoneBook.containsKey("Aditya")){
            System.out.println("We got Aditya");
        }
        if(phoneBook.containsKey(999999999)){
            System.out.println("esa bhi hota hai kya");
        }else{
            System.out.println("ye kya kar diya");
        }
    }
}
