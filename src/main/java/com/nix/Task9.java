package com.nix;

public class Task9 {
    public static void observeArray(int[]array){
        int countPosetiv = 0;
        int countNegativ = 0;
        int countNull = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i]==0){
                countNull++;
            }else if(array[i]>0){
                countPosetiv++;
            }else{
                countNegativ++;
            }
        }
        System.out.println("quantity of null numbers equals " + countNull);
        System.out.println("quantity of posetive numbers equals " + countPosetiv);
        System.out.println("quantity of negative numbers equals " + countNegativ);
    }
    public static void main(String[] args) {
        int[]array = {0, 5, 10, -5, 0, -6};
        observeArray(array);
    }
}
