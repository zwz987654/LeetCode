package com.company;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class No34 {

    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (target > nums[mid]) {
                lo++;
            } else if (target < nums[mid]) {
                hi--;
            } else {
                lo = hi = mid;
                while (lo - 1 >= 0 && nums[lo - 1] == target) {
                    lo--;
                }
                while (hi + 1 <= nums.length - 1 && nums[hi + 1] == target) {
                    hi++;
                }
                result[0] = lo;
                result[1] = hi;
                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] ints2 = searchRange(new int[]{1,4}, 4);
        for (int i : ints2) {
            System.out.println(i);
        }
    }
}
