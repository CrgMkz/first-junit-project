package com.in28minutes.junit.helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by craig on 30/04/17.
 */
public class ArraysCompareTest{

    @Test
    public void testArraySort_RandomArray(){
        int[] numbers = {12,3,4,0};
        int[] expected = {0,3,4,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

}