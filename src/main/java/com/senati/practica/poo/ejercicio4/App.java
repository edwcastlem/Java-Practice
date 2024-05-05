package com.senati.practica.poo.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // USuarios
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("edward", "123456"));
        usuarios.add(new Usuario("fernando", "123"));
        usuarios.add(new Usuario("rodrigo", "456"));
        
        String[] menuCajero = {"CONSULTAR SALDO", "DEPOSITAR DINERO", "RETIRAR", "SALIR"};
        String[] menuApp = {"INICIAR SESION", "SALIR"};
        
        int optPrin;
        
        //Menu principal
        do {    
            optPrin = mostrarMenu("MENU PRINCIPAL", menuApp);
            
            switch (optPrin) {
                case 1 -> {
                    System.out.print("Ingresa usuario: ");
                    String usuario = sc.nextLine();

                    System.out.print("Ingresa clave: ");
                    String clave = sc.nextLine();
                    
                    Usuario u = obtenerUsuario(usuario, clave, usuarios);
                    
                    if (u != null)
                    {
                        int opt;
                        do {
                            opt = mostrarMenu("  CAJERO BANCARIO  ", menuCajero);

                            switch (opt) {
                                case 1 -> {
                                    u.getCuenta().consultarSaldo();
                                }
                                case 2 -> {
                                    System.out.print("Ingresa monto a depositar:");
                                    float monto = sc.nextFloat();
                                    u.getCuenta().depositarDinero(monto);
                                    //u.getCuenta().consultarSaldo();
                                }
                                case 3 -> {
                                    System.out.print("Ingresa monto a retirar:");
                                    float monto = sc.nextFloat();
                                    u.getCuenta().retirarDinero(monto);
                                }
                                case 4 -> {
                                    System.out.println("Byeee " + u.getNombre());
                                }
                                case 5 -> {
                                    System.out.println("Opción no válida. Intenta nuevamente!");
                                }
                            }
                        } while (opt != 4); // sale de la cuenta del usuario
                    }
                }
                case 2 -> {
                    System.out.println("Adios!!!!");
                }
                default -> {
                    System.out.println("Opción no válida. Intenta nuevamente!");
                }
            }

        } while (optPrin != 2); // sale del programa principal
    }
    
    public static int mostrarMenu(String titulo, String[] opciones) {
        System.out.println("\n" + titulo);
        System.out.println("=".repeat(titulo.length()));
        for(int i=0; i<opciones.length; i++) {
            System.out.println("%d. %s".formatted(i+1, opciones[i]));
        }
        System.out.print(">>> Ingresa opción: ");
        int opt = sc.nextInt();
        sc.nextLine();
        return opt;
    }
    
    public static Usuario obtenerUsuario(String usuario, String clave, List<Usuario> usuarios) {
        // buscamos el usuario
        for(Usuario u : usuarios) {
            if(u.getNombre().equals(usuario)) { 
                int intentos = 0;
                while (intentos < 2) {
                    if (u.getClave().equals(clave)) {
                        System.out.print("\nBienvenido %s!!!".formatted(u.getNombre()));
                        return u;
                    }
                    else {
                        intentos++;
                        System.out.println("Clave incorrecta. Intente nuevamente!!");
                        System.out.print("Ingresa clave: ");
                        clave = sc.nextLine();
                    }
                }
                return null;
            }
        }
        System.out.println("Usuario no encontrado!!!");
        return null;
    }
}
