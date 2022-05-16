package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FIFORhymerUnitTest {
    final int EMPTY_STACK = -1;
    FIFORhymer rhymer;
    int testValue;
    int res;

    @Before
    public void setUp (){
        rhymer = new FIFORhymer();
    }

    @Test
    public void testCountOut(){

        res = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK, res);

        testValue = 4;
        rhymer.countIn(testValue);

        res = rhymer.countOut();
        Assert.assertEquals(testValue,res);

        res = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK, res);
    }
}