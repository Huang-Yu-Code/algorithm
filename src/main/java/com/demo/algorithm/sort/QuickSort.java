package com.demo.algorithm.sort;

/**
 * 快速排序
 *
 * @author codingob
 */
public class QuickSort {
    /**
     * 数组大小
     */
    private final static int SIZE = 2;

    /**
     * 排序
     *
     * @param n 数组
     */
    public static int[] sort(int[] n) {
        int[] array = Common.copyArray(n);
        if (array.length < SIZE) {
            throw new RuntimeException("数组长度不能小于2");
        }
        int i = 0;
        int l;
        int r;
        while (true) {
            r = right(array, i);
            l = left(array, i);
            if (r == -1) {
                i++;
                if (i > n.length - 1) {
                    break;
                }
            } else {
                if (r > l) {
                    if (l == -1) {
                        array = Common.swap(array, r, i);
                    } else {
                        array = Common.swap(array, l, r);
                    }
                } else {
                    array = Common.swap(array, r, i);
                }
            }
        }
        return array;
    }

    /**
     * 左边查找
     *
     * @param n 数组
     * @param i 起始索引
     * @return 查找结果(索引)，-1未找到
     */
    private static int left(int[] n, int i) {
        for (int j = i + 1; j < n.length - 1; j++) {
            if (n[j] > n[i]) {
                return j;
            }
        }
        return -1;
    }

    /**
     * 右边查找
     *
     * @param n 数组
     * @param i 起始索引
     * @return 查找结果(索引)，-1未找到
     */
    private static int right(int[] n, int i) {
        for (int j = n.length - 1; j > i; j--) {
            if (n[j] < n[i]) {
                return j;
            }
        }
        return -1;
    }
}
