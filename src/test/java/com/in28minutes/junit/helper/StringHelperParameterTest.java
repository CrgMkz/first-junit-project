package com.in28minutes.junit.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by craig on 28/04/17.
 */
@RunWith(Parameterized.class)
public class StringHelperParameterTest {
    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringHelperParameterTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutputs[][] = {{"AACD","CD"}, {"ACD", "CD"}};

        return Arrays.asList(expectedOutputs);
    }

        @Test
    public void testtruncateAInFirst2Positions(){
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));

      }

}