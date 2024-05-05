package com.senati.practica;

import java.util.Scanner;

public class LecturaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        System.out.println("Ingresa un entero (int): ");
//        int myInt = sc.nextInt();
//        System.out.println("Mi Entero: " + myInt);
//        
//        
//        System.out.println("Ingresa un entero (long): ");
//        long myLong = sc.nextLong();
//        System.out.println("Mi long: " + myLong);
//        
//        
//        System.out.println("Ingresa un booleano: ");
//        boolean myBool = sc.nextBoolean();
//        System.out.println("Mi booleano: " + myBool);
//        
//        sc.nextLine();
//        
//        System.out.println("Ingresa un String: ");
//        String myString = sc.nextLine();
//        System.out.println("Mi booleano: " + myString);
//        
//        sc.close();

        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        
        System.out.println("Hola mi nombre es %s y tengo %d años".formatted(nombre, edad));
    }
}
