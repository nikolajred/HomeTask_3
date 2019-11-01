package com.nix;

public class Task10
{
    public static int [] swapElement(int[]array){
        if(array.length == 0 || array == null){
            System.out.println("Array is empty");
            return null;
        }
        int numberMaxElement = 0;
        int maxElement = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxElement){
                maxElement = array[i];
                numberMaxElement = i;
            }
        }
        int numberMinElement =0;
        int minElement = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < minElement){
                minElement = array[i];
                numberMinElement = i;
            }
        }
        int swapNumber = array[numberMaxElement];
        array[numberMaxElement] = array[numberMinElement];
        array[numberMinElement] = swapNumber;
        for(int k = 0; k < array.length; k++){
            System.out.print(array [k] + " ");
        }
        return array;

    }
    public static void main(String[] args) {
        int[]array = new int[0];
        swapElement(array);
    }
}