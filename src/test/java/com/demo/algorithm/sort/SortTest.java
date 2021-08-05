package com.demo.algorithm.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 测试类
 *
 * @author codingob
 */
@Slf4j
public class SortTest {

    @Test
    void quickSort() {
        int[] n = {2, 1, 4, 4, 5, 5, 8, 7};
        int[] sort = QuickSort.sort(n);
        int[] result = new int[n.length];
        System.arraycopy(n, 0, result, 0, n.length);
        Arrays.sort(result);
        Assertions.assertArrayEquals(result, sort);
    }

    @Test
    void bubbleSort() {
        int[] n = {2, 1, 4, 4, 5, 5, 8, 7};
        int[] sort = BubbleSort.sort(n);
        int[] result = new int[n.length];
        System.arraycopy(n, 0, result, 0, n.length);
        Arrays.sort(result);
        Assertions.assertArrayEquals(result, sort);
    }

    @Test
    void insertionSort() {
        int[] n = {2, 1, 4, 4, 5, 5, 8, 7};
        int[] sort = InsertionSort.sort(n);
        int[] result = new int[n.length];
        System.arraycopy(n, 0, result, 0, n.length);
        Arrays.sort(result);
        Assertions.assertArrayEquals(result, sort);
    }
}
