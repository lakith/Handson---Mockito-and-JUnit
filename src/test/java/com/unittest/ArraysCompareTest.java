package com.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class ArraysCompareTest {

    @Test
    public void testArraySort_RanomArray() {
        int numbers[] = {1 ,13, 5, 4};
        int expected[] = {1, 4, 5, 13};

        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }

    @Test(expected=NullPointerException.class)
    public void testArraySort_NullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout=100)
    public void testSort_Performance(){
        int array[] = {12,23,4};
        for(int i=1;i<=1000000;i++)
        {
            array[0] = i;
            Arrays.sort(array);
        }
    }

}
