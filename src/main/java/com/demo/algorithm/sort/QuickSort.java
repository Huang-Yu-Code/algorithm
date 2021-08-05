package com.demo.algorithm.sort;

/**
 * 快速排序
 *
 * @author codingob
 */
public class QuickSort {

    /**
     * 排序
     *
     * @param n 数组
     */
    public static int[] sort(int[] n) {
        Common.enableSort(n);
        int[] array = new int[n.length];
        System.arraycopy(n, 0, array, 0, n.length);
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
                        Common.swap(array, r, i);
                    } else {
                        Common.swap(array, l, r);
                    }
                } else {
                    Common.swap(array, r, i);
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
