package com.leetcode.dp;

/**
 * 是否存在和等于sum的数字
 * <p>
 * 01背包类似
 * <p>
 * 这类题一般两个状态:i和sum
 * 这类题一般两个状态:i和v
 */
public class SelectSum {
    /**
     * 递归是否存在和等于sum的数字
     *
     * @param a
     * @param i a的下标
     * @param s
     * @return
     */
    public static boolean selectSumRe(int[] a, int i, int s) {
        if (i < 0) {
            return false;
        }
        if (i == 0) {
            return s == a[i];
        }
        if (a[i] > s) {
            return selectSumRe(a, i - 1, s);
        }
        return selectSumRe(a, i - 1, s) || selectSumRe(a, i - 1, s - a[i]);
    }

    /**
     * dp是否存在和等于sum的数字
     * <p>
     * f[i,s]:前i个数的和是否等于s
     *
     * @param a
     * @return
     */
    public static boolean selectSumDp(int[] a) {
        return true;
    }
}
