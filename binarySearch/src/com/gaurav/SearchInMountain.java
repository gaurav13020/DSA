package com.gaurav;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }else {
            int secondTry = orderAgnosticBS(arr, target, peak, arr.length - 1);
            return secondTry;
        }
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

    static int orderAgnosticBS(int[] arr, int target, int start, int end){


        boolean isAsc = arr[start] < arr[end];
        while(start <= end){

            int mid = start + (end - start)/2;

                if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
}
