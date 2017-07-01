package com.ds.recursion;

/**
 * Created by sahuj6 on 6/28/17.
 */
public class SumOfArray {
    public static int sum(int[] nums, int index) {
        if(index == -1) {
            return 0;
        } else {
            return sum(nums, index - 1) + nums[index];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(sum(nums, nums.length-1));
    }

}
