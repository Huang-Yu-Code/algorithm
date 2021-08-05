package com.demo.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author codingob
 * @version 1.0.0
 * @since JDK1.8
 */
public class MergeSort {
    public static int[] sort(int[] n) {
        Common.enableSort(n);
        int[] array = new int[n.length];
        System.arraycopy(n, 0, array, 0, n.length);
        int middle = n.length / 2;
        // TODO

        return array;
    }

    private static void merge(int l, int r) {

    }

    private static void sort(int[] n, int l, int len, int end) {
        int r = l + len;
        for (int i = l; i < l + len; i++) {
            for (int j = r; j < end; j++) {
                if (n[i] > n[j]) {
                    Common.swap(n, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] n = {2, 1};
        int middle = n.length / 2;
        sort(n,0,1,1);
        System.out.println(Arrays.toString(n));
    }
}
