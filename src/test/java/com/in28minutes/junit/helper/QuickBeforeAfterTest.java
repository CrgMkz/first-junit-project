package com.in28minutes.junit.helper;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by craig on 30/04/17.
 */
public class QuickBeforeAfterTest{

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @Before
    public void setup(){
        System.out.println("Before test");
    }

    @Test
    public void test1(){
        System.out.println("test1 executed");
    }

    @Test
    public void test2(){
        System.out.println("test2 executed");
    }

    @After
    public void teardown(){
        System.out.println("After test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }
}