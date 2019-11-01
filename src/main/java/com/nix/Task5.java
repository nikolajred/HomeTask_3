package com.nix;

public class Task5
{
    public static int[] searchEvenNumbers(int[]array){
        int countEven =0;
        int [] arrayEven;
        if(array == null || array.length ==0){
            System.out.println("Array is null or empty");
            return null;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                countEven++;
            }
        }
        if(countEven==0){
            System.out.println("Array doesn't have even numbers");
            return null;
        }else{
            arrayEven = new int[countEven];
            int j = 0;
            for(int k = 0; k < array.length; k++){
                if(array[k]%2 == 0){
                    arrayEven[j]=array[k];
                    j++;
                }
            }
        }
        for(int l = 0; l < arrayEven.length; l++){
            System.out. print(arrayEven[l] + " ");}
        return arrayEven;
    }
    public static void main(String[] args) {
        int [] array = null;
        searchEvenNumbers(array);
    }
}