package com.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/reverse-integer/#/description
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * Note:
 * The input is assumed to be a 32-bit signed integer.
 *      Your function should return 0 when the reversed integer overflows.
 */
public class E0007ReverseInteger {
    public static void main(String[] args) {
        E0007ReverseInteger reverseInteger = new E0007ReverseInteger();
        System.out.println(reverseInteger.reverse(-1534236469));
    }
    public int reverse(int x) {
        int flag = 1;
        if (x < 0) {
            flag = -1;
            x = x*flag;
        }

        long result = 0;
        while (x>0) {
            if ((result * 10) > Integer.MAX_VALUE) {
                return 0;
            }
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        return (int)result*flag;
    }
}
