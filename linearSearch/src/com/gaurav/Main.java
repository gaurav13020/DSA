package com.gaurav;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int ans = linearSearch2(nums, target);
        System.out.println(ans);

    }
    //search array and return index otherwise -1

    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        //enhanced for loop
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}