package com.gaurav;

import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search3(arr, 11)));
    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart < cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if (matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid + 1;
            } else {
                cEnd = mid -1;
            }
        }
        return new int[] {-1, -1};
    }
    static int[] search(int[][] matrix, int target){
         int rows = matrix.length;
         int cols = matrix[0].length;

         if (rows ==1){
            return binarySearch(matrix, 0, 0, cols -1, target);
             }
         int rStart = 0;
         int rEnd = rows - 1;
         int cMid = cols/2;

         while (rStart < (rEnd-1) ){
             int mid = rStart + (rEnd - rStart) / 2;
             if ( matrix[mid][cMid] == target){
                 return new int[] {mid, cMid};

             }
             if(matrix[mid][cMid] < target){
                 rStart = mid;
             } else {
                 rEnd = mid;
             }
         }
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    static int search2 (int[][] matrix, int target){

        int rStart = 0;
        int rEnd = matrix[0][matrix.length-1]-1;
        while (rStart <= rEnd){
            int mid = rStart + (rEnd - rStart)/2;
            if (matrix[mid][0] == target){
                return mid;
            }
            if (matrix[mid][0] < target){
                rStart = mid + 1;
            } else {
                rEnd = mid;
            }
        }
        return rEnd - 1;
    }

    static int[] search3 (int[][] matrix, int target){
        int arrStart = search2(matrix, target);
        int start = 0;
        int end = matrix[0].length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (matrix[arrStart][start] == target){
                return new int[] {arrStart, start};
            }
            if (matrix[arrStart][mid] < target){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return new int[] {-1, -1};
    }

}
