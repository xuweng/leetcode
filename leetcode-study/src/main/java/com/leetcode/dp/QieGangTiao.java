package com.leetcode.dp;

/**
 * 切钢条
 * <p>
 * 切or不切
 * 放or不放
 * 选or不选
 */
public class QieGangTiao {
    /**
     * 切钢条
     * 将钢条从左边切割下长度为i的一段，只对右边剩下的长度为n-i的一段继续进行切割，对左边的一段则不再进行切割。
     * 这样得到的公式为：。这样原问题的最优解只包含一个相关子问题（右端剩余部分）的解，而不是两个。
     *
     * @param p 价格列表
     * @param n 钢条长度
     * @return
     */
    public static int qieGangTiaoRe(int[] p, int n) {
        if (n <= 0) {
            return 0;
        }

        int max = -1;
        for (int j = 1; j <= n; j++) {
            max = Math.max(max, p[j - 1] + qieGangTiaoRe(p, n - j));
        }

        return max;
    }
}
