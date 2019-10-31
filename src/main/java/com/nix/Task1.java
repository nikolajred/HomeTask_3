package com.nix;

public class Task1 {
        public int searchSum(int[]array, int k){
            for(int i :array){
                System.out.print(i + " ");
            }
            System.out.println("");
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            try {
                if (array[i] % k == 0) {
                    sum += array[i];
                    System.out.print(array[i] + " ");

                }
            } catch (ArithmeticException e) {
                System.out.println("You can’t divide number by zero!");
            }
        }
        System.out.println("\n" + "sum of numbers multiple k (" + k + ") equal " + sum);

        return sum;
    }
        public static void main(String[] args) {
            Task1 task1 = new Task1();
        int[]array = {5, 6, 8, 12, 81, 36, 5, 7};
        int k = 0;

        task1.searchSum(array, k);
    }
}
