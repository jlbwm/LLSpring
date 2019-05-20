package com.tdd;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Jiaxin Li on 5/20/19.
 */
public class PrimeUtilTest {
    @Test
    public void testGetPrimesForEmptyResult() {
        int[] expected = {};

        Assert.assertArrayEquals(expected, PrimeUtil.getPrime(2));
        Assert.assertArrayEquals(expected, PrimeUtil.getPrime(0));
        Assert.assertArrayEquals(expected, PrimeUtil.getPrime(-1));

    }
    @Test
    public void testGetPrimes() {
        Assert.assertArrayEquals(new int[]{2,3,5,7}, PrimeUtil.getPrime(9));
        Assert.assertArrayEquals(new int[]{2,3,5,7, 11, 13}, PrimeUtil.getPrime(17));
        Assert.assertArrayEquals(new int[]{2,3,5,7, 11, 13, 17, 19, 23, 29}, PrimeUtil.getPrime(30));



    }
}
