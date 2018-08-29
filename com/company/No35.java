package com.company;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * <p>
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * <p>
 * Example 4:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class No35 {
    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!(num < target)) {
                return i;
            }
        }
        return nums.length;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int i = searchInsert(nums, 7);
        System.out.println(i);
    }
}
