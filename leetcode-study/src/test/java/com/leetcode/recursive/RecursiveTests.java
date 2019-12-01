package com.leetcode.recursive;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class RecursiveTests {
    private Recursive recursive;

    @Before
    public void init() {
        recursive = new Recursive();
    }

    @Test
    public void isStrobogrammaticTest() {
        Recursive recursive = new Recursive();
        String[] array = {"69", "88", "818"};
        for (String s : array) {
            Assert.assertTrue(recursive.isStrobogrammatic(s));
        }
    }

    @Test
    public void isStrobogrammaticRecursiveTest() {
        Recursive recursive = new Recursive();
        String[] array = {"69", "88", "818"};
        for (String s : array) {
            Assert.assertTrue(recursive.isStrobogrammaticRecursive(s, 0, s.length() - 1));
        }
    }
}
