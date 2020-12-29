package com.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumTest {
    //UC1
    @Test//TC1
    public void testIntegerMaximum1() {
        int arr[] = {1,2,3};
        int result = 0;
        Maximum maximum = new Maximum();
        result = maximum.maxInteger(arr);
        Assert.assertEquals(3,result);
    }

    @Test//TC2
    public void testIntegerMaximum2() {
        int arr[] = {1,3,2};
        int result = 0;
        Maximum maximum = new Maximum();
        result = maximum.maxInteger(arr);
        Assert.assertEquals(3,result);
    }
    @Test//TC3
    public void testIntegerMaximum3() {
        int arr[] = {3,1,2};
        int result = 0;
        Maximum maximum = new Maximum();
        result = maximum.maxInteger(arr);
        Assert.assertEquals(3,result);
    }

    //UC2
    @Test//TC1
    public void testFloatMaximum1() {
        float arr[] = {1.0F, 2.0F, 3.0F};
        float result = 0.0F;
        Maximum maximum = new Maximum();
        result = maximum.maxFloat(arr);
        Assert.assertEquals(3.0F,result,0);
    }
    @Test//TC2
    public void testFloatMaximum2() {
        float arr[] = {1.0F, 3.0F, 2.0F};
        float result = 0.0F;
        Maximum maximum = new Maximum();
        result = maximum.maxFloat(arr);
        Assert.assertEquals(3.0F,result,0);
    }
    @Test//TC3
    public void testFloatMaximum3() {
        float arr[] = {3.0F, 2.0F, 1.0F};
        float result = 0.0F;
        Maximum maximum = new Maximum();
        result = maximum.maxFloat(arr);
        Assert.assertEquals(3.0F,result,0);
    }

    //UC3
    @Test//TC1
    public void testStringMaximum1() {
        String arr[] = {"apple","banana","peach"};
        String result = null;
        Maximum maximum = new Maximum();
        result = maximum.maxString(arr);
        Assert.assertEquals("banana",result);
    }
    @Test//TC2
    public void testStringMaximum2() {
        String arr[] = {"banana","apple","peach"};
        String result = null;
        Maximum maximum = new Maximum();
        result = maximum.maxString(arr);
        Assert.assertEquals("banana",result);
    }
    @Test//TC3
    public void testStringMaximum3() {
        String arr[] = {"apple","peach","banana"};
        String result = null;
        Maximum maximum = new Maximum();
        result = maximum.maxString(arr);
        Assert.assertEquals("banana",result);
    }
}