package com.senati.practica;


public class ArraysAndFor {
    public static void main(String[] args) {
        int[] array = {12, 2, 14, 31, 100};
        
        for(int i=0; i < array.length; i++) {
            System.out.println("array[%d] = %d".formatted((i+1), array[i]));
        }
    }
}
