/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.practica;

import java.util.Scanner;

/**
 *
 * @author ED
 */
public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("========= HALLAR EL PROMEDIO ==========");
        System.out.print("Ingrese cantidad de datos: ");
        int n = sc.nextInt();
        int suma = 0;
        
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la nota %d: ".formatted(i+1));
            array[i] = sc.nextInt();
            suma += array[i];
        }
        
        System.out.println("El promedio es: %.2f".formatted((float)suma/n));
        
    }
}
