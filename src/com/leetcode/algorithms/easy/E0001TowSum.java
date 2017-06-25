package com.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/#/description
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 *      Given nums = [2, 7, 11, 15], target = 9,
 *      Because nums[0] + nums[1] = 2 + 7 = 9,
 *      return [0, 1].
 */
public class E0001TowSum {
    public static void main(String[] args) {
        E0001TowSum towSum = new E0001TowSum();
        int[] res = towSum.towSum(new int[]{3, 2, 1}, 4);
        String resStr = String.format("[%d, %d]", res[0],res[1]);
        System.out.println(resStr);
    }

    public int[] towSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
