package com.gaurav;

public class SearchInRange {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int start = 1;
        int end = 4;
        int ans = searchInRange(nums, target, start, end);
        System.out.println(ans);
    }

    static int searchInRange(int[] arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i <= end ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
