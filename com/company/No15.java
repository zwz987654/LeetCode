package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zouwenzhe on 2016-6-23.
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

 Note: The solution set must not contain duplicate triplets.

 For example, given array S = [-1, 0, 1, 2, -1, -4],

 A solution set is:
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 */
public class No15 {

    //3Sum其实可以转化成一个2Sum的题，我们先从数组中选一个数，并将目标数减去这个数，
    //得到一个新目标数。然后再在剩下的数中找一对和是这个新目标数的数，其实就转化为2Sum了。为了避免得到重复结果，我们不仅要跳过重复元素，
    // 而且要保证2Sum找的范围要是在我们最先选定的那个数之后的。
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int temp=-127,left,right;
        for (int i = 0; i < nums.length-2; i++) {
            if (temp == nums[i]) continue;//为防止第一个元素重复，做验证
            temp = nums[i];
            left = i+1;
            right = nums.length-1;
            while(left < right){
                if (nums[left] + nums[right] + temp == 0) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    result.add(subList);
                    while (left < right && nums[left]==nums[left+1]) left++;//如果跟右一个元素重复，多加1
                    while (left < right && nums[right]==nums[right-1]) right--;
                    left++;right--;
                    System.out.println(subList);
                }else if (nums[left] + nums[right] + temp > 0){
                    right--;
                }else if (nums[left] + nums[right] + temp < 0){
                    left++;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] S = {-1, 0, 1, 2, -1, -4};
        int[] S2 = {0,0,0,0};
        int[] S3 = {-1,0,1,2,-1,-4};
        int[] S4 = {-1,0,1,2,-1,-4};
        int[] S5 = {-2,0,0,2,2};
        List list = threeSum(S2);
    }
}
