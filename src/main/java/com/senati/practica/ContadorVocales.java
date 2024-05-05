package com.senati.practica;

import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        
        char vocales[] = {'a', 'e', 'i', 'o', 'u'}; 
        
        System.out.println("Palabra: " + palabra);
        for(char vocal : vocales) {
            int contador = 0;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.toLowerCase().charAt(i) == vocal ) {
                    contador++;
                }
            }
            System.out.println(vocal + " = " + contador);
        }
        
        /*
        for(int i=0; i < palabra.length(); i++) {
            switch(palabra.toLowerCase().charAt(i)) {
                case 'a', 'á' -> contA++;
                case 'e', 'é' -> contE++;
                case 'i', 'í' -> contI++;
                case 'o', 'ó' -> contO++;
                case 'u', 'ú' -> contU++;
            }
        }
        
        System.out.println("Palabra: " + palabra);
        System.out.println("a = %d".formatted(contA));
        System.out.println("e = %d".formatted(contE));
        System.out.println("i = %d".formatted(contI));
        System.out.println("o = %d".formatted(contO));
        System.out.println("u = %d".formatted(contU));

        /*
        System.out.print("Ingrese un numero del 1 al 7: ");
        int dia = sc.nextInt();

        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número inválido";
        }
        */

        //System.out.println("El día es: " + nombreDia);
    }
}
