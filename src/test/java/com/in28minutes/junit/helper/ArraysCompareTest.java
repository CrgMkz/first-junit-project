package com.in28minutes.junit.helper;

import org.junit.Test;

import java.lang.reflect.Array;
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

    //The following passes null to the arrays.sort
    // method resulting in an exception
    @Test
    public void testArraySort_NullArray() {
        int[] numbers = null;
        try {
            Arrays.sort(numbers);
        } catch (NullPointerException e) {
            //Success
        }
    }
    //This is the same but uses a
    //special annotation
    @Test(expected=NullPointerException.class)
    public void testArraySort_NullArray2() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    //This will fail as it's an empty
    //array and will not throw an exception
//    @Test(expected=NullPointerException.class)
//    public void testArraySort_NullArray3() {
//        int[] numbers = {};
//        Arrays.sort(numbers);
//    }

    //This test checks if it can complete the following
    //request within a set number of milliseconds
    @Test(timeout=100)
    public void testSort_Performance() {
        int array[] = {12,23,4};
        for (int i = 1; i <= 1000000; i++) {
            array[0] = i;
        }


    }
}