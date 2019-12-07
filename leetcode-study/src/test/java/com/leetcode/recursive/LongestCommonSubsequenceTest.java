package com.leetcode.recursive;

import com.leetcode.dp.LongestCommonSubsequence;
import org.junit.Assert;
import org.junit.Test;

public class LongestCommonSubsequenceTest {
    @Test
    public void findLCSReTest() {
        String s1 = "abcde", s2 = "ace";
        int i = s1.length() - 1, j = s2.length() - 1;
        Assert.assertEquals(3, LongestCommonSubsequence.findLCSRe(s1, s2, i, j));
    }
}
