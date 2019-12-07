package com.leetcode.dp;

/**
 * 选择不相邻的数的和的最大值
 */
public class NoXiangLingMax {
    /**
     * 递归不相邻的数的和的最大值
     *
     * @param a
     * @param i a的下标
     * @return
     */
    public static int noXiangLingMaxRe(int[] a, int i) {
        if (i <= 0) {
            return a[i];
        }
        if (i == 1) {
            return Math.max(a[i - 1], a[i]);
        }
        return Math.max(noXiangLingMaxRe(a, i - 2) + a[i], noXiangLingMaxRe(a, i - 1));
    }
}
