package com.nix;

public class Task6
{
    public static int indicateLength(int[]array){
        if(array.length == 0 || array == null){
            System.out.println("Array is empty");
            return 0;
        }
        int smallestLength = 0;
        int maxElement = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxElement){
                maxElement = array[i];
            }
        }
        int minElement = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < minElement){
                minElement = array[i];
            }
        }
        smallestLength = maxElement - minElement;
        System.out.println(maxElement);
        System.out.println(minElement);
        System.out.println("The smallest length of the numerical equals " + smallestLength);
        return smallestLength;
    }
    public static void main(String[] args) {
        int[]array = {-6, 10, 0, 11, -15, 12};
        indicateLength(array);
    }
}
