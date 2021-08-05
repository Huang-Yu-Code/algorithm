package com.github.codingob.algorithm.sort;

/**
 * 冒泡排序
 *
 * @author codingob
 * @version 1.0.0
 * @since JDK1.8
 */
public class BubbleSort {

    /**
     * 排序
     *
     * @param n 数组
     */
    public static int[] sort(int[] n) {
        Common.enableSort(n);
        int[] array = new int[n.length];
        System.arraycopy(n, 0, array, 0, n.length);
        int times = n.length - 1;
        int num = n.length - 1;
        while (times > 0) {
            for (int i = 0; i < num; i++) {
                if (array[i] > array[i + 1]) {
                    Common.swap(array, i, i + 1);
                }
            }
            times--;
        }
        return array;
    }
}
