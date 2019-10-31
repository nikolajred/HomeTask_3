package com.nix;

public class Task4 {
    public boolean searchIncrease(int[]array){
        boolean search = false;
        if(array==null){
            search = false;
        }else {
            int count = 0;
            for (int i = 0; i <array.length ; i++) {
                if (array[i]==0){
                    count++;
                }
            }if(count==array.length){
                System.out.println("Array has only zeros");
                search = false;
                return false;
            }

            exit:
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        search = false;
                        break exit;
                    } else {
                        search = true;
                    }
                }
            }

            if (search == true) {
                System.out.println("Array is increasing");
            } else {
                System.out.println("Array isn't increasing");
            }
        }

        System.out.println(search);
        return search;
    }
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        int[]array = {0, 0, 0, 0, 0};
        task4.searchIncrease(array);
    }
}
