package com.gaurav;

public class CountSubsetSumRM {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 10};
        int sum = 10;
        int n = arr.length;

        int[][] t = new int[n+1][sum+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                t[i][j] = -1;
            }
        }


        int ans = countSubset(arr, sum, n, t);
        System.out.println(ans);
    }

    private static int countSubset(int[] arr, int sum, int n, int[][] t) {
        if(sum == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }

        if (t[n][sum] != -1){
            return t[n][sum];
        }

        if (arr[n-1] <= sum){
            return t[n][sum] = countSubset(arr, sum- arr[n-1], n-1, t) + countSubset(arr, sum, n-1, t);
        }else {
            return t[n][sum] = countSubset(arr, sum, n-1, t);
        }
    }
}
