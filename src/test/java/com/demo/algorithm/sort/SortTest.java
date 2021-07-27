package com.demo.algorithm.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author codingob
 */
@Slf4j
public class SortTest {
    @Test
    void quickSort() {
        int[] n = {2, 1, 4, 4, 5, 5, 8, 7};
        int[] sort = QuickSort.sort(n);
        int[] result = Common.copyArray(n);
        Arrays.sort(result);
        Assertions.assertArrayEquals(result, sort);
        log.info("原始数组: " + Arrays.toString(n));
        log.info("验证排序数组: " + Arrays.toString(sort));
        log.info("正确排序后的数组: " +Arrays.toString(result));

    }

    @Test
    void bubbleSort() {
        int[] n = {2, 1, 4, 4, 5, 5, 8, 7};
        int[] sort = BubbleSort.sort(n);
        int[] result = Common.copyArray(n);
        Arrays.sort(result);
        Assertions.assertArrayEquals(result, sort);
        log.info("原始数组: " + Arrays.toString(n));
        log.info("验证排序数组: " + Arrays.toString(sort));
        log.info("正确排序后的数组: " +Arrays.toString(result));
    }
}
