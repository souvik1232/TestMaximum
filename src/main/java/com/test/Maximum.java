package com.test;

public class Maximum <E extends Comparable<E>> {
    E a[];

    public Maximum(E[] a) {
        this.a = a;
    }

    public static <E extends Comparable<E>> E maxValue(E[] array){
        E temp = array[0];
        for (int i =1 ; i< array.length;i++){
            if (temp.compareTo(array[i])<0)
                temp=array[i];
        }
        return temp;
    }
    public E maxValue(){
        return maxValue(a);
    }

}
