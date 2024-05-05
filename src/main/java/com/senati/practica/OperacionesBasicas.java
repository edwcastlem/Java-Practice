
package com.senati.practica;

import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese valor de x: ");
        int x = sc.nextInt();
        System.out.println("Ingrese valor de y: ");
        int y = sc.nextInt();
        
        int add = x + y;
        int prod = x * y;
        int div = x / y;
        double div_double = (double) x / y;
        int res = x % y;
        
        System.out.println("x = %d     |  y = %d".formatted(x, y));
        System.out.println("Suma: %d".formatted(add));
        System.out.println("Producto: %d".formatted(prod));
        System.out.println("Division entera: %d".formatted(div));
        System.out.println("Division decimal: %f".formatted(div_double));
        System.out.println("Residuo: %d".formatted(res));
    }
}
