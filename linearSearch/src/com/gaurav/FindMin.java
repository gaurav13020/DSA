package com.gaurav;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,-7,8,9,10};
        System.out.println(min(nums));
    }
    static int min(int[] arr) {
        int ans = arr[0];
        for (int j : arr) {
            if (j < ans) {
                ans = j;
            }

        }
        return ans;
    }

}
