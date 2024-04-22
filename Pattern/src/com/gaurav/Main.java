package com.gaurav;

public class Main {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n){
        int originalN = n+1;
        n = 2*n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int a = Math.min(col, row);
                int b = Math.min( n - col, n - row);
                int atEveryIndex = originalN - Math.min(a,b);



                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <=  n; row++) {
            for (int space = 0; space < n-row ; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--){
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");

            }
            System.out.println();
        }

    }

    static void pattern5(int n) {
        for (int row = 1; row < n+n; row++) {

            if (row < n){
                for (int col = 1; col <= row ; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else {
                for (int col2 = 1; col2 <= n+n-row ; col2++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }

    static void pattern5alt(int n) {
        for (int row = 1; row < n+n; row++) {

            int totalCols = row > n ? n+n-row : row;
            for (int col = 1; col <= totalCols ; col++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= n+n; row++) {
            int totalCols = row > n ? n+n-row : row;
            int spaces = row > n ? row-n : n-row;
            for (int space = 1; space <= spaces ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCols ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
