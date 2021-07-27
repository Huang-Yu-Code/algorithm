package com.demo.algorithm.sort;

/**
 * 公用类
 *
 * @author codingob
 * @version 1.0.0
 * @since JDK1.8
 */
public class Common {
    /**
     * 数组最小长度
     */
    private final static int LENGTH = 2;

    /**
     * 是否满足排序条件
     * @param n 待排序数组
     */
    public static void enableSort(int[] n) {
        if (n.length < LENGTH) {
            throw new RuntimeException("数组长度不能小于2");
        }
    }

    /**
     * 复制数组
     *
     * @param n 原始数组
     * @return 新的数组
     */
    public static int[] copyArray(int[] n) {
        int[] array = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            array[i] = n[i];
        }
        return array;
    }

    /**
     * 交换数组指定元素
     *
     * @param n 数组
     * @param a 下标
     * @param b 下标
     */
    public static int[] swap(int[] n, int a, int b) {
        int[] array = copyArray(n);
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }
}
