package com.bridgelabz;

public class PrintTheArrayUsingGenerics {
    public static<E> void printArrays(E[] args) {
        for (E x : args){
            System.out.print(x+",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[]intArray ={1,2,3,4,4,5,6,7};
        Character[]charArray={'A','D','I','T','Y','A'};
        Float[]floatArray={1.4f,5.4f,5.6f};
        Double[]doubles={2.0,3.0,3.5};
        Boolean[]booleans={true,false};

        printArrays(intArray);
        printArrays(charArray);
        printArrays(floatArray);
        printArrays(doubles);
        printArrays(booleans);
    }
}
