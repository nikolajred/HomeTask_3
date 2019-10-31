package com.nix;

public class Task3 {
    public int searchFirstNumber(int[] array) {
        int result = 0;
        if (array == null) {
            result = 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    System.out.println("First element is positive");
                    result = array[i];
                    break;
                } else if (array[i] < 0) {
                    System.out.println("First element is negative");
                    result = array[i];
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int[] array = {0, 0, 9, -3};
        task3.searchFirstNumber(array);
    }
}
