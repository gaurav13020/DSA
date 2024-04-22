package com.gaurav;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,3,7,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]){
                // descending part of array
                end = mid;
            } else {
                //ascending part of array
                start = mid+1;
            }
        }
        return start;
    }

}

