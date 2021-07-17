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
        int[] a = {2,1,4,4,5,5,8,7};
        QuickSort.sort(a);
        log.info(Arrays.toString(a));

        int[] b = {2,1,4,4,5,5,8,7};
        Arrays.sort(b);
        log.info(Arrays.toString(b));

        Assertions.assertEquals(Arrays.toString(b), Arrays.toString(a));
    }
}
