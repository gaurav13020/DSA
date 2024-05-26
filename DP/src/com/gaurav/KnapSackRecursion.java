package com.gaurav;

public class KnapSackRecursion {
    public static void main(String[] args) {
        int[] wt = {1, 2, 3, 4};
        int[] val = {2, 5, 7, 9};
        int w = 8;
        int n = 4;

        int[][] t = {{-1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1}};

        int ans = knapsack(wt, val, w, n, t);
        System.out.println(ans);
    }

    private static int knapsack(int[] wt, int[] val, int w, int n, int[][] t) {
        if(w==0 || n == 0){
            return 0;
        }

        if (t[n][w] != -1){
            return t[n][w];
        }
        if (wt[n-1] <= w){
            return t[n][w] = Math.max(val[n-1] + knapsack(wt, val, w- wt[n-1], n-1, t), knapsack(wt, val, w, n-1, t));
        }else {
            return t[n][w] = knapsack(wt, val, w, n-1, t);
        }
    }
}
