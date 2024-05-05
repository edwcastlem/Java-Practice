package com.senati.practica.clases;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void saludar() {
        System.out.println("Mi nombre es %s y mi edad es %d".formatted(nombre, edad));
    }
    
    public void abc() {
        System.out.println("Hola mundo!!");
    }
}
