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
public class TablaMultiplicar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa N = ");
        int n = sc.nextInt();
        
        for (int i = 0; i <= 12; i++) {
            System.out.println("%d x %d = %d".formatted(n,i,i*n));
        }
    }
}
