package com.senati.practica.poo.ejercicio2;

public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcularArea() {
        return this.base * this.altura;
    }
    
    public float calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
    
    public void imprimirInformacion() {
        System.out.println("RECTANGULO:");
        System.out.println("  Base: " + this.base);
        System.out.println("  Altura: " + this.altura);
        System.out.println("  Area: " + this.calcularArea());
        System.out.println("  Perímetro: " + this.calcularPerimetro());
    }
}
