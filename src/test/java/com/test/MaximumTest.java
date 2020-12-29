package com.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumTest {
    //UC1
    @Test//TC1
    public void testIntegerMaximum1() {
        Integer arr[] = {1,2,3};
        int result = 0;
        Maximum maximum = new Maximum(arr);
        result = maximum.maxValue(arr);
        Assert.assertEquals(result,3);
    }

    @Test//TC2
    public void testIntegerMaximum2() {
        Integer arr[] = {1,3,2};
        int result = 0;
        Maximum maximum = new Maximum(arr);
        result = maximum.maxValue(arr);
        assertEquals(3,result);
    }
    @Test//TC3
    public void testIntegerMaximum3() {
        Integer arr[] = {3,1,2};
        int result = 0;
        Maximum maximum = new Maximum(arr);
        result = maximum.maxValue(arr);
        Assert.assertEquals(3,result);
    }

    //UC2
    @Test//TC1
    public void testFloatMaximum1() {
        Float arr[] = {1.0F, 2.0F, 3.0F};
        float result = 0.0F;
        Maximum maximum = new Maximum(arr);
        result = maximum.maxValue(arr);
        Assert.assertEquals(3.0F,result,0);
    }
    @Test//TC2
    public void testFloatMaximum2() {
        Float arr[] = {1.0F, 3.0F, 2.0F};
        float result = 0.0F;
        Maximum maximum = new Maximum(arr);
        result = maximum.maxValue(arr);
        Assert.assertEquals(3.0F,result,0);
    }
    @Test//TC3
    public void testFloatMaximum3() {
        Float arr[] = {3.0F, 2.0F, 1.0F};
        float result = 0.0F;
        Maximum maximum = new Maximum(arr);
        result = maximum.maxValue(arr);
        Assert.assertEquals(3.0F,result,0);
    }

    //UC3
    @Test//TC1
    public void testStringMaximum1() {
        String arr[] = {"apple","banana","peach"};
        String result = null;
        Maximum maximum = new Maximum(arr);
        result = maximum.maxValue(arr);
        Assert.assertEquals("peach",result);
    }
    @Test//TC2
    public void testStringMaximum2() {
        String arr[] = {"banana","apple","peach"};
        String result = null;
        Maximum maximum = new Maximum(arr);
        result = maximum.maxValue(arr);
        Assert.assertEquals("peach",result);
    }
    @Test//TC3
    public void testStringMaximum3() {
        String arr[] = {"apple","peach","banana"};
        String result = null;
        Maximum maximum = new Maximum(arr);
        result = maximum.maxValue(arr);
        Assert.assertEquals("peach",result);
    }

    @Test
    public void testGenericMax() {
        Integer arr[] = {1,2,3};
        Maximum maximum = new Maximum(arr);
        Assert.assertEquals(maximum.maxValue(),3);
    }
}