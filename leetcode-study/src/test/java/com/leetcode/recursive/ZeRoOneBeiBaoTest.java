package com.leetcode.recursive;

import com.leetcode.dp.ZeRoOneBeiBao;
import org.junit.Assert;
import org.junit.Test;

public class ZeRoOneBeiBaoTest {
    int[] v = {0, 2, 1, 3, 2};//体积
    int[] p = {0, 3, 2, 4, 2};//价值
    int n = 4;//物品数量
    int vMax = 5;//最大容积

    @Test
    public void maxPRe() {
        Assert.assertEquals(7, ZeRoOneBeiBao.maxPRe(v, p, n, vMax));
    }

    @Test
    public void maxPDpTest() {
        Assert.assertEquals(7, ZeRoOneBeiBao.maxPDp(v, p, n, vMax));
    }
}
