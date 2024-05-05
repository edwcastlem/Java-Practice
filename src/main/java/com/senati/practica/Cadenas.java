package com.senati.practica;

public class Cadenas {
    public static void main(String[] args) {       
        
        // Concatenación de cadenas
        String parte1 = "Hola";
        String parte2 = "Mundo";

        String saludo = parte1 + " " + parte2;  // Concatenación con espacio

        System.out.println("Saludo concatenado: " + saludo);
 
        
        // Longitud de una cadena
        int longitud = saludo.length(); 
        System.out.println("Longitud del saludo: " + longitud);
        
        
        // Acceso a un carácter específico
        char primerCaracter = saludo.charAt(0);
        System.out.println("Primer carácter del saludo: " + primerCaracter);
 
        
        // Subcadenas
        String parteDelSaludo = saludo.substring(5);
        System.out.println("Parte del saludo: " + parteDelSaludo);
 
        
        // Búsqueda de un carácter o subcadena
        int posicionDeEspacio = saludo.indexOf(" ");
        System.out.println("Posición del espacio: " + posicionDeEspacio);
 
        
        // Reemplazo de caracteres
        String saludoReemplazado = saludo.replace("Mundo", "Universo");
        System.out.println("Saludo reemplazado: " + saludoReemplazado);
 
        
        // Conversión a mayusculas/minusculas
        String saludoMayusculas = saludo.toUpperCase();
        String saludoMinusculas = saludo.toLowerCase();
        System.out.println("Saludo en mayúsculas: " + saludoMayusculas);
        System.out.println("Saludo en minúsculas: " + saludoMinusculas);
 
        
        // División de cadenas
        String[] palabras = saludo.split(" ");
        System.out.println("Palabras divididas:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        
        
        //Cadenas dinámicas
        String curso = "Java";
        int nota = 10;
        String cadena = "Llevas el curso %s y tu nota es %d".formatted(curso, nota);
        System.out.println(cadena);
        
        
        
        // Otro ejemplo
        String cadena22 = String.format("Llevas el curso %s y tu nota es %d", curso, nota);
        System.out.println(cadena22);
        
        
        
        // Ejemplo con expresiones regulares
        String cadena1 = "Soy un el valor 10";
        String cadena2 = "F-93248349";
        System.out.println("Cadena1: " + cadena1);
        System.out.println("La cadena contiene el formato buscado: " + cadena1.matches("F-\\d+"));
        
        System.out.println("\nCadena2: " + cadena2);
        System.out.println("Formato buscado F-####...#");
        System.out.println("La cadena contiene el formato buscadoo: " + cadena2.matches("F-\\d+"));
        
        
        // Uso de StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" ");
        sb.append("como");
        sb.append(" ");
        sb.append("estas");
        
        System.out.println(sb);
    }
}