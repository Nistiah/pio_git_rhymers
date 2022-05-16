package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HanoiRhymerUnitTest {
    HanoiRhymer hanoiRhymer;
    int testValue;
    int res;

    @Before
    public void setUp() {
        hanoiRhymer = new HanoiRhymer();
    }

    @Test
    public void  testReportRejected(){
        testValue = 0;
        res = hanoiRhymer.reportRejected();
        Assert.assertEquals(testValue, res);
    }

    @Test
    public void testCountIn(){
        testValue = 4;
        hanoiRhymer.countIn(testValue);
        res = hanoiRhymer.peekaboo();
        Assert.assertEquals(testValue, res);
    }
}