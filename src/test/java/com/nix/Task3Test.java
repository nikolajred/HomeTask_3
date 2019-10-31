package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void searchFirstNumber() {
        Task3 task3 = new Task3();
        int[] array = {0, 1, -5};
        int actual = task3.searchFirstNumber(array);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void searchFirstNull() {
        Task3 task3 = new Task3();
        int[] array = {0, 0, 0};
        int actual = task3.searchFirstNumber(array);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    } @Test
    public void searchFirstEmpty() {
        Task3 task3 = new Task3();
        int[] array = null;
        int actual = task3.searchFirstNumber(array);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}