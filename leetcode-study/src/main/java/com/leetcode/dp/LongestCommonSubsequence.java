package com.leetcode.dp;

import java.util.Objects;

/**
 * 最长公共子序列长度
 * 涉及子序列问题，十有八九都需要动态规划来解决
 */
public class LongestCommonSubsequence {
    /**
     * 递归最长公共子序列长度
     *
     * @param s1
     * @param s2
     * @return
     */
    public static int findLCSRe(String s1, String s2, int i, int j) {
        Objects.requireNonNull(s1);
        Objects.requireNonNull(s2);
        if (i < 0 || j < 0) {
            return 0;
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            return findLCSRe(s1, s2, i - 1, j - 1) + 1;
        } else {
            return Math.max(findLCSRe(s1, s2, i, j - 1), findLCSRe(s1, s2, i - 1, j));
        }
    }
}
