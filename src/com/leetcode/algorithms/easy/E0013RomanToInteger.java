package com.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/#/description
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 *      Roman Numerals Chart: http://literacy.kent.edu/Minigrants/Cinci/romanchart.htm
 */
public class E0013RomanToInteger {
    public static void main(String[] args) {
        E0013RomanToInteger romanToInteger = new E0013RomanToInteger();
        System.out.println(romanToInteger.romanToInt("DCCCXC"));
    }

    public int romanToInt(String s) {
        /*int result = 0;
        Map<String, Integer> baseChart = new HashMap<>();
        baseChart.put("I", 1);
        baseChart.put("V", 5);
        baseChart.put("X", 10);
        baseChart.put("L", 50);
        baseChart.put("C", 100);
        baseChart.put("D", 500);
        baseChart.put("M", 1000);

        int x=0, y=0;
        for (int i=0; i<s.length()-1; i++) {
            x = baseChart.get(String.valueOf(s.charAt(i)));
            y = baseChart.get(String.valueOf(s.charAt(i+1)));
            if (x < y) {
                result += -x;
            } else {
                result += x;
            }
        }
        // add last char
        result += baseChart.get(String.valueOf(s.charAt(s.length()-1)));
        return result;*/

        char[] cs = s.toCharArray();
        int i = 0, val = 0;

        while (i<cs.length) {
            // System.out.print(cs[i]);
            switch (cs[i++]) {
                case 'M': val+=1000; break;
                case 'D': val+=500; break;
                case 'C':
                    if (i<cs.length && cs[i]=='D') { val+=400; i++; }
                    else if (i<cs.length && cs[i]=='M') { val+=900; i++; }
                    else val+=100;
                    break;
                case 'L': val+=50; break;
                case 'X':
                    if (i<cs.length && cs[i]=='L') { val+=40; i++; }
                    else if (i<cs.length && cs[i]=='C') { val+=90; i++; }
                    else val+=10;
                    break;
                case 'V': val+=5; break;
                case 'I':
                    if (i<cs.length && cs[i]=='V') { val+=4; i++; }
                    else if (i<cs.length && cs[i]=='X') { val+=9; i++; }
                    else val+=1;
                    break;
            }
            // System.out.println(" "+val);
        }
        return val;
    }
}
