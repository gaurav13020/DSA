package com.gaurav;

public class KnapSack01 {
    public static void main(String[] args) {
        int[] wt = {1, 2, 3, 4};
        int[] val = {2, 5, 7, 9};
        int w =8;
        int n = 4;

        int[][] t = new int[n+1][w+1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]);
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        System.out.println(t[n][w]);
    }
}
