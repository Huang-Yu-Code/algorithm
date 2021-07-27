package com.demo.algorithm.sort;

/**
 * 冒泡排序
 *
 * @author codingob
 * @version 1.0.0
 * @since JDK1.8
 */
public class BubbleSort {
    public static int[] sort(int[] n) {
        int[] array = Common.copyArray(n);
        int times = n.length - 1;
        int num = n.length - 1;
        while (times > 0) {
            for (int i = 0; i < num; i++) {
                if (array[i] > array[i + 1]) {
                    array = Common.swap(array, i, i + 1);
                }
            }
            times--;
        }
        return array;
    }
}
