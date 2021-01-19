package com.upgrad.hp;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetAndProblems {
/*
1. check for char, whether it's there in hashmap
            -- increent the value for that key
2. if the key is nott there in hashmap
            -- we will add that key with value 1
3. check value for every key..if it's equal to 1 then thats your answer
 */
    static void findUniqueChar(String input){
        HashMap<Character,Integer> hm= new HashMap<Character, Integer>();
        int count=0;
        for(int i= 0;i<input.length();i++){
            char c =input.charAt(i);
             if(hm.get(c)!=null && hm.get(c)>0){
                 count=hm.get(c)+1;
                 hm.put(c,count);
             }else{
                 hm.put(c,1);
             }
        }
        int min=Integer.MAX_VALUE;
        char cc=' ';
        for(int i= 0;i<input.length();i++){
            char c =input.charAt(i);
            if (min>hm.get(c)){ // 12321
               cc=c;
                min=hm.get(c);
            }
//            if(hm.get(c)==1){
//                System.out.println(c);
//                break;
//            }
        }
        System.out.println(cc);
        System.out.println(min);
    }
    static void ss(String input){
        HashMap<Character, Integer> hM = new HashMap<Character, Integer>();
        int counter=0;
        for(int i = 0, n = input.length() ; i < n ; i++) {
            char c = input.charAt(i);
            if (hM.get(c) != null && hM.get(c) >0){
                counter=hM.get(c)+1;
                hM.put(c,counter);
            }else{
                hM.put(c,1);
            }

        }
        for(int i = 0, n = input.length() ; i < n ; i++) {
            char c = input.charAt(i);
            if (hM.get(c) != null && hM.get(c) ==1){
                System.out.println(hM.get(c));
                System.out.println(c);
                break;
            }

        }

    }
    static void findSymmetricPairsUsingNA(int arr[][]){
        for(int i = 0; i < arr.length; i++) {                // Traverse through the given array
            int first = arr[i][0];                        // Get the first and second elements
            int second = arr[i][1];

            for (int j = i + 1; j < arr.length; j++) {           // Check whether the pairs are symmetric to the current pairs or not
                int secondO = arr[j][1];
                int firstO = arr[j][0];
                if (firstO == second && secondO == first)    //If the current pair is symmetric to
                    System.out.println("(" + first + ", " + second + ")");
            }
        }
    }
    static void findSymmetricPairsUsingHM(int arr[][])
    {
        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            // First and second elements of current pair
            int first = arr[i][0];
            int sec   = arr[i][1];
            // Look for second element of this pair in hash
            Integer val = hM.get(sec);
            // If found and value in hash matches with first
            // element of this pair, we found symmetry
            if (val != null && val == first)
                System.out.println("(" + sec + ", " + first + ")");
            else  // Else put sec element of this pair in hash
                hM.put(first, sec);
        }
    }
    static boolean areElementsContiguous(int arr[],int n) {
        // Find maximum and
        // minimum elements.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<Integer> us = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            us.add(arr[i]);
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int m = max - min + 1;

        // There should be at least
        // m elements in aaray to
        // make them contiguous.
        if (m > n || m != us.size())
            return false;
        while (us.contains(min) == true) {
            // increment min
            min++;
        }
        if (min-1!=max){
            return false;
        }else {
            return true;
        }
    }
    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
    static void lockKeys(String lock[],String key[]){
        HashMap<String,Integer> ans=new HashMap<String, Integer>();
        for (int i=0;i<lock.length;i++){
            ans.put(lock[i],i);
        }
        for (int i=0;i<key.length;i++){
            if (ans.containsKey(key[i])){
                System.out.print(key[i]);
                System.out.println(ans.get(key[i])+" "+i);
            }
        }
    }
    public static void main(String[] args) {
        String input="aabrakadabra";
        findUniqueChar(input);
    }
}
