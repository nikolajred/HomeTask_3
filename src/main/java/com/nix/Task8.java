package com.nix;

public class Task8
{
    public static int findNumbers(int[]array){
        int count = 0;
        if(array.length == 0 || array == null){
            System.out.println("Array is empty");
            return 0;
        }
        boolean result = false;
        for(int j = 0; j < array.length; j++){
            if(array[j] == 0){
                result = true;
            }
        }
        if(result == true){
            for(int i = 0; i < array.length; i++){
                if(array[i] != 0){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[]array = {1, 2, 3, 4, 0};
        findNumbers(array);

    }
}
