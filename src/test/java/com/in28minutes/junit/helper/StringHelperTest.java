package com.in28minutes.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by craig on 28/04/17.
 */
public class StringHelperTest{

    @Test
    public void test(){
        StringHelper helper = new StringHelper();
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
        //expected, actual
    }

}