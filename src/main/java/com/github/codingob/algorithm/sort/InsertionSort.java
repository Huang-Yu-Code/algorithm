package com.github.codingob.algorithm.sort;

/**
 * 插入排序
 *
 * @author codingob
 * @version 1.0.0
 * @since JDK1.8
 */
public class InsertionSort {
    public static int[] sort(int[] n) {
        Common.enableSort(n);
        int[] array = new int[n.length];
        System.arraycopy(n, 0, array, 0, n.length);
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0) {
                if (array[j] > array[j - 1]) {
                    break;
                }
                Common.swap(array, j, j - 1);
                j--;
            }
        }
        return array;
    }
}
