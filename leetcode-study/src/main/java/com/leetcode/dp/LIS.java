package com.leetcode.dp;

import java.util.Arrays;

/**
 * 最长上升子序列
 * d(i)就是找以A[i]结尾的lis
 */
public class LIS {
    //备忘录
    private static int[] memo = new int[100];

    static {
        Arrays.fill(memo, -1);
    }

    /**
     * 递归最长上升子序列
     *
     * @param a
     * @param i 数组下标
     * @return
     */
    public static int lisRe(int a[], int i) {
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        int max = -1;
        for (int j = 0; j <= i - 1; j++) {
            int temp = a[j] > a[i] ? 1 : lisRe(a, j) + 1;
            max = Math.max(max, temp);
        }

        return max;
    }

    /**
     * 递归备忘录最长上升子序列
     *
     * @param a
     * @param i 数组下标
     * @return
     */
    public static int lisReMemo(int a[], int i) {
        if (memo[i] != -1) {
            return memo[i];
        }
        if (i < 0) {
            return 0;
        }
        if (i == 0) {
            memo[i] = 1;
            return memo[i];
        }
        int max = -1;
        for (int j = 0; j <= i - 1; j++) {
            int temp = a[j] > a[i] ? 1 : lisRe(a, j) + 1;
            max = Math.max(max, temp);
        }
        memo[i] = max;
        return max;
    }

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
