package com.leetcode.dp;

/**
 * 最长上升子序列
 * d(i)就是找以A[i]结尾的lis
 */
public class LIS {
    /**
     * dp最长上升子序列
     *
     * @param a
     * @return
     */
    public static int lisDp(int a[]) {
        int n = a.length;
        int[] dpMax = new int[n + 1];
        dpMax[0] = 0;
        dpMax[1] = 1;

        for (int i = 2; i <= n; i++) {
            int max = -1;
            for (int j = 1; j <= i - 1; j++) {
                int temp = (a[j - 1] > a[i - 1]) ? 1 : dpMax[j] + 1;
                max = Math.max(max, temp);
            }
            dpMax[i] = max;
        }

        return dpMax[n];
    }
}
