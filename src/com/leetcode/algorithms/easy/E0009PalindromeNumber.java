package com.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/palindrome-number/#/description
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class E0009PalindromeNumber {
    public static void main(String[] args) {
        E0009PalindromeNumber palindromeNumber = new E0009PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        /*boolean  res = false;
        int xx = x;
        long reverse = 0;
        while (x != 0) {
            reverse *= 10;
            reverse += x % 10;
            x /= 10;
        }
        if (xx == reverse) {
            res = true;
        }
        return res;*/

        if(x < 0) return false;
        int div = 1;
        while(x / div >= 10) div = div * 10;
        while(x > 0) {
            if(x / div != x % 10) return false;
            x = x % div;
            x = x / 10;
            div = div / 100;
        }
        return true;
    }
}
