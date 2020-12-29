package com.test;

public class Maximum {
    public static int maxInteger(int array[] ) {
        int temp = 0;
        for (int i =0 ; i< array.length;i++){
            for (int j = 1; j< array.length;j++){
                if(array[j-1] < array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[0];
    }
}
