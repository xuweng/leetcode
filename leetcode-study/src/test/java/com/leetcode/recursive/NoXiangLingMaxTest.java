package com.leetcode.recursive;

import com.leetcode.dp.NoXiangLingMax;
import org.junit.Assert;
import org.junit.Test;

public class NoXiangLingMaxTest {
    @Test
    public void noXiangLingMaxReTest() {
        int[] a = {1, 2, 4, 1, 7, 8, 3};
        int i = a.length - 1;

        Assert.assertEquals(15, NoXiangLingMax.noXiangLingMaxRe(a, i));
    }
}
