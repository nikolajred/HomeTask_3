package com.nix;

public class Task2 {
    public int[] searchNullElements(int[]array){
        int[] result;
        if(array == null){
         return null;
        }else{
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    ++count;
                }
            }
            result = new int[count];
            int k = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == 0 && k < result.length) {
                    result[k] = j;
                    ++k;
                }
            }
            for (int h = 0; h < result.length; h++) {
                System.out.print(result[h] + " ");
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int[]array = {0, 2, 9, 0};
        task2.searchNullElements(array);
    }
}
