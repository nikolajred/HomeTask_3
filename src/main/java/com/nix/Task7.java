package com.nix;

public class Task7
{
    public static int[] replacZElement(int[]array, int Z){
        if(array.length == 0 || array == null || Z == 0){
            System.out.println("Array is empty or Z equals zero");
            return null;
        }
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(Z > array[i]){
                array[i] = Z;
                count++;
            }
        }
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
        System.out.println(count);
        return array;
    }
    public static void main(String[] args) {
        int[]array = {8, 2, 3, 0, -9};
        int Z = 3;
        replacZElement(array, Z);
    }
}
