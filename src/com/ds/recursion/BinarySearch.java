package com.ds.recursion;

/**
 * Created by sahuj6 on 6/28/17.
 */
public class BinarySearch {
    public static boolean search(int num[], int target, int low, int high) {
        if(low > high) return false;

        int mid = (low + high) / 2;
        if(num[mid] == target) {
            return true;
        }
        if(num[mid] > target) {
            return search(num, target, low, mid - 1);
        } else {
            return search(num, target, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,4,5,6,7,8,9,12,13,14};
        System.out.println(search(nums, 19, 0, 9));
    }
}
