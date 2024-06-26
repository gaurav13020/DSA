package com.gaurav;

import java.util.Arrays;

class FindMissing {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i< nums.length){
            int correct = nums[i];
            if (nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }

        }
        for (int j = 0; j < nums.length; j++) {
                if(j!=nums[j]){
                    return j;
                }

            }
        return nums.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}