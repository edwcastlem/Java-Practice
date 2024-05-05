package com.senati.practica.poo.ejercicio4;

public class Cuenta {
    private float saldo;
    private Usuario usuario;

    public Cuenta(Usuario usuario) {
        this.saldo = 0;
        this.usuario = usuario;
    }

    public Cuenta(float saldo, Usuario usuario) {
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Cajero{" + "saldo=" + saldo + ", usuario=" + usuario + '}';
    }
    
    public void consultarSaldo() {
        System.out.println("Usuario: " + this.usuario.getNombre());
        System.out.println("Saldo: " + this.saldo);
    }
    
    public void depositarDinero(float monto) {
        if (monto <= 0) {
            System.out.println("Ingrese una cantidad valida");
            return;
        }
        saldo = saldo + monto;
        System.out.println("Monto depositado correctamente!");
    }
    
    public void retirarDinero(float monto) {
        if (monto <= 0) {
            System.out.println("Ingrese una cantidad valida");
            return;
        }
        
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro correcto!!");
        }
        else {
            System.out.println("Saldo insuficiente!!!");
        }
    }
}
