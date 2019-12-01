package com.leetcode.recursive;

import java.util.HashMap;
import java.util.Objects;

/**
 * 递归
 */
public class Recursive {

    private HashMap<Character, Character> map = new HashMap<Character, Character>();

    public Recursive() {
        map.put('1', '1');
        map.put('0', '0');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');
    }

    public Recursive(HashMap<Character, Character> map) {
        this.map = map;
    }

    /**
     * 对称数
     *
     * @param num
     * @return
     */
    public boolean isStrobogrammatic(String num) {
        int left = 0, right = num.length() - 1;
        while (left <= right) {
            if (!map.containsKey(num.charAt(right)) || num.charAt(left) != map.get(num.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * 递归对称数
     * 小数：1个数、2个数直接求解,不用递归下去;3个数以上才递归
     *
     * @param num
     * @return
     */
    public boolean isStrobogrammaticRecursive(String num, int left, int right) {
        Objects.requireNonNull(num);
        if (left > right) {
            return false;
        }
        if (left == right) {
            return map.containsKey(num.charAt(right));
        }

        if (right - left == 1) {
            return num.charAt(left) == map.get(num.charAt(right));
        }

        return (num.charAt(left) == map.get(num.charAt(right))) && isStrobogrammaticRecursive(num, left + 1, right - 1);

    }
}
