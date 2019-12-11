package com.leetcode.lru;

/**
 * 散列表和链表两种数据结构组合使用
 */
public class HashLRU {
    //缓存容量
    private static Integer capacity = 100;
    //缓存大小
    private static Integer size = 0;

    private Node<Integer>[] table = new Node[capacity];

    /**
     * 简单hash
     *
     * @param date
     * @return
     */
    private static int hash(int date) {
        return date - 1;
    }

    private static class Node<T> {
        private T date;
        private Node<T> prev;
        private Node<T> next;
        //hnext 指针是为了将结点串在散列表的拉链中
        private Node<T> hNext;

        public Node() {
        }

        public Node(T date) {
            this.date = date;
        }
    }
}
