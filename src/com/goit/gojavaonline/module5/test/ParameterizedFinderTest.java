package com.goit.gojavaonline.module5.test;

import com.goit.gojavaonline.module5.Finder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



@RunWith(value = Parameterized.class)

public class ParameterizedFinderTest {

    Finder finder = new Finder();
    private int[] mas;
    private int minExpected;
    private int maxExpected;


    public ParameterizedFinderTest(int[] mas, int minExpected, int maxExpected) {
        this.mas = mas;
        this.minExpected = minExpected;
        this.maxExpected = maxExpected;
    }

    @Parameterized.Parameters (name = "{index} = min and max value of array")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{-23, 5, 21, 10 , 0, -3, 12 }, -23, 21},
                {new int[]{0 , 0, 23 , -7, 9, -2}, -7, 23},
                {new int[]{29 , 27, 555 , -7, 9, -2}, -7, 555},
                {new int[]{2 , 2, 3 , 0, 1, 3}, 0, 3}
        });
    }

    @Test (timeout = 2000)
    public void testFindMax() throws Exception {

        Assert.assertEquals(maxExpected, finder.findMax(mas));

    }

    @Test (timeout = 2000)
    public void testFindMin() throws Exception {

        Assert.assertEquals(minExpected, finder.findMin(mas));

    }
}