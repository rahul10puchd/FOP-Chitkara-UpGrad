package com.upgrad.dp;

public class CoinExchangeRecursion {
    public static int total(int amount, int[] coins, int i) {
        if (amount < 0) {
            return 0;
        }
        if (amount == 0) {
            return 1;
        }
        // means coins over and amount>0 so no solution
        if (i == coins.length && amount > 0) {
            return 0;
        }
        return total(amount - coins[i], coins, i) + total(amount, coins, i + 1);
    }
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = { 1, 2, 3 };
        System.out.println("By Recursion: " + total(amount, coins, 0));
    }
}