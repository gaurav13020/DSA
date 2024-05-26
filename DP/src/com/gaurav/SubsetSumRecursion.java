package com.gaurav;

public class SubsetSumRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int sum = 11;
        int n = arr.length;

        boolean[][] t = new boolean[n+1][sum+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                t[i][j] = false;
            }
        }


        boolean ans = subsetsum(arr, sum, n, t);
        System.out.println(ans);
    }
    private static boolean subsetsum(int[] arr, int sum, int n, boolean[][] t) {
        if(sum == 0){
            return true;
        }
        if(n == 0){
            return false;
        }

        if (t[n][sum]){
            return t[n][sum];
        }

        if (arr[n-1] <= sum){
            return t[n][sum] = subsetsum(arr, sum- arr[n-1], n-1, t) || subsetsum(arr, sum, n-1, t);
        }else {
            return t[n][sum] = subsetsum(arr, sum, n-1, t);
        }
    }
}
