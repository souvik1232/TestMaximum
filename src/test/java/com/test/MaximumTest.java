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
}