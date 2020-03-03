package com.cursor.discriminant;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class DiscriminantTest {
    private static final double DELTA = 1e-15;
    private final Discriminant discriminant = new Discriminant();

    @Test
    public void get() {
        //given
        double firstArgument = 5.0;
        double secondArgument = 10.0;
        double thirdArgument = 4.0;
        double expectedResult = 20.0;

        //then
        Assert.assertNotNull(discriminant);

        discriminant.setAllArgument(firstArgument, secondArgument, thirdArgument);
        double actualResult = discriminant.get();
        Assert.assertEquals(expectedResult, actualResult, DELTA);
    }

    @Test
    public void transformDoubleToStringByDecimalFormat() {
        //given
        double argument = 20.411565456;
        String expectedResult = "20.41";

        //then
        Assert.assertNotNull(discriminant);
        String actualResult = discriminant.transformDoubleToStringByDecimalFormat(argument);

        Assert.assertFalse(actualResult.isBlank());
        Assert.assertEquals(expectedResult, actualResult);
    }
}