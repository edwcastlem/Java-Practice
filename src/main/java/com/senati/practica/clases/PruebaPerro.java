package com.senati.practica.clases;

import java.util.Scanner;

public class PruebaPerro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INGRESANDO INFORMACIÓN DEL PERRO...");
        System.out.print("Ingresa nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingresa su raza: ");
        String raza = sc.nextLine();
        
        System.out.print("Ingresa su edad: ");
        int edad = sc.nextInt();
        
        Perro p = new Perro(nombre, edad, raza);
        
        p.info();
        
        p.ladrar();
    }
}
