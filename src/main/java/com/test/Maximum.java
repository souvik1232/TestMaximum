package com.test;

public class Maximum {
    public static <E extends Comparable<E>> E maxValue(E[] array){
        E temp = array[0];
        for (int i =1 ; i< array.length;i++){
            if (temp.compareTo(array[i])<0)
                temp=array[i];
        }
        return temp;
    }
}
