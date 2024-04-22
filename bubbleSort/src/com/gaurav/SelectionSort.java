package com.gaurav;

import javax.swing.*;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,0,5,4,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void cyclic(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[arr[i]-1]){
                swap(arr, i, arr[i]-1);
            }

        }
    }



    static void cyclic2  (int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
    }


    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int end = arr.length -i -1;
            int maxIndex = getMax(arr, 0 , end);
            swap(arr, maxIndex, end);
        }
    }

    static int getMax(int[] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
