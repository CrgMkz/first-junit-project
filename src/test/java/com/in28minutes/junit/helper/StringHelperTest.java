package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by craig on 28/04/17.
 */
public class StringHelperTest{
    StringHelper helper;

    @Before
    public void before(){
        helper = new StringHelper();
    }

    @Test
    public void testtruncateAInFirst2Positions_Ainfirst2positions(){
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

        //expected, actual
    }

    @Test
    public void testtruncateAInFirst2Positions2_1AInFirstPosition(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testtruncateAInFirst2Positions2_NoAPresent(){
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testtruncateAInFirst2Positions2_2AsInLastPositions(){
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_messageExample(){
        assertFalse("The condition failed", false);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_OnlyTwoCharacters(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_SingleCharacterFalse(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }



}