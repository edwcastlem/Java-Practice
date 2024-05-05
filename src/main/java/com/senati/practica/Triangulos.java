package com.senati.practica;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();
        
        String res = "";
       
        //Izquierda
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                res += "*";
            }
            res += "\n";
        }
        
        //Derecha
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= 0; j--) {
                if (i >= j)
                    res += "*";
                else
                    res += " ";
            }
            res += "\n";
        }
        
        // Completo
        for (int i = 0; i < n; i++) {
            // relleno los espacios
            for (int j = 0; j < n - i; j++) {
                res += " ";
            }
            
            // relleno los asteriscos
            for (int k = 0; k < 2*i + 1; k++) {
                res += "*";
            }
            res += "\n";      
        }
        
        System.out.println(res);
    }
}
