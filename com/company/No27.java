package com.company;

import java.util.ArrayList;

/**
 * Created by zouwenzhe on 2016-6-27.
 * Given an array and a value, remove all instances of that value in place and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:
 Given input array nums = [3,2,2,3], val = 3

 Your function should return length = 2, with the first two elements of nums being 2.
 */
public class No27 {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                continue;
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++)
            nums[i] = list.get(i);
        return list.size();
    }


    public static void main(String[] args) {
        int[] a = new int[]{2};
        int i = removeElement(a, 3);
        System.out.println(i);
    }
}
