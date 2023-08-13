package com.powernode.junit.service;

import org.junit.Assert;
import org.junit.Test;

public class MathServiceTest {

    @Test
    public void testSum() {
        MathService mathService = new MathService();
        int actual = mathService.sum(1, 2);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSub(){
        MathService mathService = new MathService();
        int actual = mathService.sub(9, 6);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}
