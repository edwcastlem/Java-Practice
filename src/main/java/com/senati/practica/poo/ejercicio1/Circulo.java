package com.senati.practica.poo.ejercicio1;

public class Circulo {
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(this.radio, 2));
    }
    
    public float calcularCircunferencia() {
        return (float) (2 * Math.PI * this.radio);
    }
    
    public void imprimirInformacion() {
        System.out.println("CIRCULO:");
        System.out.println("  Radio: %.2f".formatted(this.radio));
        System.out.println("  Area: %.2f".formatted(this.calcularArea()));
        System.out.println("  Perimetro: %.2f".formatted(this.calcularCircunferencia()));
    }
}
