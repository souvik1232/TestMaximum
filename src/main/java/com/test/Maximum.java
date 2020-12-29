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
        printMax(temp);
        return temp;
    }
    public static  <E> void printMax(E a){
        System.out.println("The maximum Value is :" + a);
    }
    public E maxValue(){
        return maxValue(a);
    }

}
