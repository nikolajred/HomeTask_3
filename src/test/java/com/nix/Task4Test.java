package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void searchIncrease() {
        Task4 task4 = new Task4();
        int[]array = {45, 58, 63};
        Boolean actual = task4.searchIncrease(array);
        Boolean expected = true;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void searchIncreaseNull() {
        Task4 task4 = new Task4();
        int[]array = null;
        Boolean actual = task4.searchIncrease(array);
        Boolean expected = false;
        Assert.assertEquals(actual, expected);
    }  @Test
    public void searchIncreaseZero() {
        Task4 task4 = new Task4();
        int[]array = {0, 0, 0, 0};
        Boolean actual = task4.searchIncrease(array);
        Boolean expected = false;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void searchIncreaseDis() {
        Task4 task4 = new Task4();
        int[]array = {9, 2, 3, 7};
        Boolean actual = task4.searchIncrease(array);
        Boolean expected = false;
        Assert.assertEquals(actual, expected);
    }
}