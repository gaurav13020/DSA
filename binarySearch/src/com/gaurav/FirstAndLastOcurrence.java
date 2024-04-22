package com.gaurav;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastOcurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,7,7,7,7,8,8,9 };
        int target = 7;

        int[] answer = firstAndLastOcurrence(arr, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] firstAndLastOcurrence(int[] arr, int target){

        int[] ans = {-1, -1};

        //check for first occurence of target first
        int start = search(arr, target, true);
        int last = search(arr, target, false);
        ans[0] = start;
        ans[1] = last;
        return ans;
    }

    static int search(int[] arr, int target, boolean firstOcurrence){

        int ans = 0;

        int start = 0;
        int end = arr.length - 1;
        while(start <= end){

            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid+1;
            } else{
                //answer found
                ans = mid;
                if (firstOcurrence){
                    end = mid -1;
                } else {
                    start = mid+1;
                }
            }

        }

        return ans;
    }
}
