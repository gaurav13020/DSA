package com.gaurav;

public class FindMaxValueOfEquation {
    public static void main(String[] args) {
        
    }
    public int findMaxValueOfEquation(int[][] points, int k) {
        int maxM=Integer.MIN_VALUE;
        for(int i = 0; i < points.length; i++){
            for (int j = 0; j < points.length; j++) {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];

                if (i == j){
                    continue;
                }else {
                    if (Math.abs(x1 - x2) <= k){
                        int ans = y1 - y2 + Math.abs(x1 - x2);
                        if(ans > maxM){
                            maxM = ans;
                        }
                        return maxM;
                    }
                }

            }
        }
        return -1;
    }
}
