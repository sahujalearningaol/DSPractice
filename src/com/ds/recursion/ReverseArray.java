package com.ds.recursion;

import java.util.Arrays;

/**
 * Created by sahuj6 on 6/28/17.
 */
public class ReverseArray {
    public static void reverse(int[] nums, int start, int end) {

        if(start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            reverse(nums, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
