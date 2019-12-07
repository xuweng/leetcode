package com.leetcode.dp;

/**
 * 选择不相邻的数的和的最大值
 */
public class NoXiangLingMax {
    //备忘录
    private static int[] memo = new int[100];
    private static int init = -1;

    static {
        for (int i = 0; i < memo.length - 1; i++) {
            memo[i] = init;
        }
    }

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

    /**
     * 算法导论里面的代码模板
     * <p>
     * 递归备忘录不相邻的数的和的最大值
     *
     * @param a
     * @param i a的下标
     * @return
     */
    public static int noXiangLingMaxReMemo(int[] a, int i) {
        if (memo[i] != init) {
            return memo[i];
        }
        if (i <= 0) {
            memo[i] = a[i];
            return memo[i];
        }
        if (i == 1) {
            memo[i] = Math.max(a[i - 1], a[i]);
            return memo[i];
        }
        memo[i] = Math.max(noXiangLingMaxReMemo(a, i - 2) + a[i], noXiangLingMaxReMemo(a, i - 1));
        return memo[i];
    }
}
