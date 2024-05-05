package com.senati.practica.clases;

import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        
        System.out.print("Ingresa su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        
        Persona p = new Persona(nombre, edad);
        
        p.saludar();
        p.abc();
    }
}
