package com.senati.practica;

import java.util.Scanner;

public class EjercicioString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese calificaciones de los estudiantes (nombre calificación): ");
        String palabra = sc.nextLine();
        String[] separados = palabra.split("\\s+");
        
        String[] nombres = new String[separados.length/2];
        float[] notas = new float[separados.length/2];
        float suma = 0;
        
        // agrupamos adecuadament
        for (int i = 0, j = 0; i < separados.length; i=i+2, j++) {
            nombres[j] = separados[i];
            notas[j] = Integer.parseInt(separados[i + 1]) ;
        }
        
        // hacemos calculos
        int posMay = 0;
        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] > notas[posMay]) {
                posMay = i;
            }
            suma += notas[i];
        }
        
        System.out.println("El promedio de las calificaciones es %.2f".formatted(suma/notas.length));
        System.out.println("El alumno con la calificacion mas alta es %s".formatted(nombres[posMay]));
    }
}
