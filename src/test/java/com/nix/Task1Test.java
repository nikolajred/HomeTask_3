package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void searchSum() {
        Task1 task1 = new Task1();
        int[]array = new int[]{4, 5, 3, 0, -1};
        int actual = task1.searchSum(array, 1);
        int expected = 11;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void searchSumNull() {
        Task1 task1 = new Task1();
        int[]array = new int[]{0, 0, 0, 0};
        int actual = task1.searchSum(array, 1);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void searchSumExeption() {
        Task1 task1 = new Task1();
        int[]array = new int[]{4, 5, 3, 0, -1};
        int actual = task1.searchSum(array, 0);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}