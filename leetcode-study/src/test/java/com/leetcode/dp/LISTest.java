package com.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class LISTest {
    @Test
    public void lisReTest() {
//        int[] a = {2, 7, 1, 5, 6, 4, 3, 8, 9};
        int[] a = {3, 1, 2, 6, 4, 5, 10, 7};
        Assert.assertEquals(5, LIS.lisRe(a, a.length - 1));
    }

    @Test
    public void lisDpTest() {
//        int[] a = {2, 7, 1, 5, 6, 4, 3, 8, 9};
        int[] a = {3, 1, 2, 6, 4, 5, 10, 7};
        Assert.assertEquals(5, LIS.lisDp(a));
    }
}
