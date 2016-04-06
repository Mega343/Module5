package com.goit.gojavaonline.module5.test;

import com.goit.gojavaonline.module5.MassivSort;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)

public class ParameterizedMassiveSortTest {

    private int[] mas;
    private int[] masExpected;


    public ParameterizedMassiveSortTest(int[] mas, int[] masExpected) {
        this.mas = mas;
        this.masExpected = masExpected;
    }

    @Parameterized.Parameters(name = "{index} = Sort array")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{-23, 5, 21, 10, 0, -3, 12}, new int[]{-23, -3, 0, 5, 10, 12, 21}},
                {new int[]{0, 0, 23, -7, 9, -2}, new int[]{-7, -2, 0, 0, 9, 23}},
                {new int[]{29, 27, 555, -7, 9, -2}, new int[]{-7, -2, 9, 27, 29, 555}},
                {new int[]{2, 2, 3, 0, 1, 3}, new int[]{0, 1, 2, 2, 3, 3}}
        });
    }

    @Test (timeout = 2000)
    public void testMassivSort() throws Exception {
        new MassivSort().massivSort(mas);
        for (int i = 0; i < masExpected.length; i++) {
            Assert.assertEquals(masExpected[i], mas[i]);
        }
    }
}
