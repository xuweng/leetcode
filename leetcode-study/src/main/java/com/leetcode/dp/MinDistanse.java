package com.leetcode.dp;

import java.util.Objects;

/**
 * 编辑距离
 */
public class MinDistanse {
    /**
     * 递归编辑距离
     * <p>
     * 返回 s1[0..i] 和 s2[0..j] 的最小编辑距离
     * <p>
     * s1变成s2,对s1操作
     *
     * @param s1
     * @param s2
     * @param i
     * @param j
     * @return
     */
    public static int findMinDistanseRe(String s1, String s2, int i, int j) {
        Objects.requireNonNull(s1);
        Objects.requireNonNull(s2);

        if (i < 0) {
            return j + 1;
        }
        if (j < 0) {
            return i + 1;
        }
        //不操作
        if (s1.charAt(i) == s2.charAt(j)) {
            return findMinDistanseRe(s1, s2, i - 1, j - 1);
        } else {
            int x = findMinDistanseRe(s1, s2, i, j - 1) + 1;//插入
            int y = findMinDistanseRe(s1, s2, i - 1, j) + 1;//删除
            int z = findMinDistanseRe(s1, s2, i - 1, j - 1) + 1;//替换

            return Math.min(Math.min(x, y), z);
        }
    }
}
