package com.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * It seems that it is not to check between pair of strings but on all the strings in the array.
 * For example:
 * {"a","a","b"} should give "" as there is nothing common in all the 3 strings.
 * {"a", "a"} should give "a" as a is longest common prefix in all the strings.
 * {"abca", "abc"} as abc
 * {"ac", "ac", "a", "a"} as a.
 */
public class E0014LongestCommonPrefix {
    public static void main(String[] args) {
        E0014LongestCommonPrefix longestCommonPrefix = new E0014LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));
    }

    public String longestCommonPrefix(String[] strs) {
        // not common PREFIX, find all common substring
        /*StringBuffer resultSb = new StringBuffer();
        List<String> resultList = new ArrayList<>();//contain all common string

        List<String> strList = Arrays.asList(strs);
        strList.sort(new Comparator<String>() {  //sort by length from short to long
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        if (strList.size() == 0) {
            return "";
        }
        minStrNextChar:
        for (int k = 0; k < strList.get(0).length(); k++) {
            for (int i = k; i < (strList.get(0).length()); i++) {
                resultSb.append(strList.get(0).charAt(i));
                strList:
                for (int j = 1; j < strList.size(); j++) {
                    if (strList.get(j).contains(resultSb.toString())) {
                        //continue;
                    } else {
                        resultSb.delete(0, resultSb.length());
                        continue minStrNextChar;
                    }
                }
                resultList.add(resultSb.toString());
            }
            break ;  //minStr is totally contained by all other string
        }

        resultList.sort(new Comparator<String>() {  //sort by length from long to short
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        return resultList.size() > 0 ? resultList.get(0) : "";*/

        // Runtime: 28 ms
        /*StringBuffer resultSb = new StringBuffer();
        List<String> strList = Arrays.asList(strs);
        strList.sort(new Comparator<String>() {  //sort by length from short to long
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        if (strList.size() == 0) {
            return "";
        }
        for (int i = 0; i < (strList.get(0).length()); i++) {
            resultSb.append(strList.get(0).charAt(i));
            for (int j = 1; j < strList.size(); j++) {
                if (strList.get(j).substring(0,i+1).equals(resultSb.toString())) {
                    //continue;
                } else {
                    return resultSb.deleteCharAt(resultSb.length()-1).toString();
                }
            }
        }
        return resultSb.toString();*/

        //Runtime: 8 ms!!
        if (strs == null || strs.length == 0) return "";
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
            i++;
        }
        return pre;
    }
}
