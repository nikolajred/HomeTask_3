package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void searchNullElements() {
        Task2 task2 = new Task2();
        int[]array = {0, 2, 0, -1};
        int [] actual = task2.searchNullElements(array);
        int[]expected = {0, 2};
        Assert.assertArrayEquals(actual, expected);
    }
    @Test
    public void searchNullElementsNull() {
        Task2 task2 = new Task2();
        int[]array = {0, 0, 0, 0};
        int [] actual = task2.searchNullElements(array);
        int[]expected = {0, 1, 2, 3};
        Assert.assertArrayEquals(actual, expected);
    }
    @Test
    public void searchNullElementsEmpty() {
        Task2 task2 = new Task2();
        int[]array = null;
        int [] actual = task2.searchNullElements(array);
        int[]expected = null;
        Assert.assertArrayEquals(actual, expected);
    }
}