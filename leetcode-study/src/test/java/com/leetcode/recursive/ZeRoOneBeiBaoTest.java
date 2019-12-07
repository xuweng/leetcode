package com.leetcode.recursive;

import com.leetcode.dp.ZeRoOneBeiBao;
import org.junit.Assert;
import org.junit.Test;

public class ZeRoOneBeiBaoTest {
    @Test
    public void maxPDpTest() {
        int[] v = {0, 2, 1, 3, 2};//体积
        int[] p = {0, 3, 2, 4, 2};//价值
        int n = 4;//物品数量
        int vMax = 5;//最大容积

        Assert.assertEquals(7, ZeRoOneBeiBao.maxPDp(v, p, n, vMax));
    }
}
