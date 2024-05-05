package com.senati.practica.poo.ejercicio3;

import java.util.Scanner;

public class App {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Inicializamos el gestor
        GestorInventario gestor = new GestorInventario();
        int opt;
        
        do {
            opt = mostrarMenu();

            switch (opt) {
                case 1 -> {
                    System.out.println("AGREGAR PRODUCTO");
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Agrega una descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingresa precio unitario: ");
                    float precio = sc.nextFloat();
                    //sc.nextLine();
                    System.out.print("Ingresa la cantidad disponible: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    Producto p = new Producto(nombre, descripcion, precio, cantidad);
                    gestor.agregarProducto(p);
                }
                case 2 -> {
                    System.out.println("ELIMINAR PRODUCTO");
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombre = sc.nextLine();

                    gestor.eliminarProducto(nombre);
                }
                case 3 -> {
                    System.out.println("BUSCAR PRODUCTO");
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = sc.nextLine();

                    Producto p = gestor.buscarProducto(nombre);
                    if (p != null) {
                        System.out.println(p);
                    }
                    else {
                        System.out.println("Producto no encontrado!!!");
                    }
                }
                case 4 -> {
                    System.out.println("ACTUALIZAR STOCK PRODUCTO");
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingresa stock a actualizar: ");
                    int stock = sc.nextInt();
                    sc.nextLine();
                    
                    Producto p = gestor.buscarProducto(nombre);

                    if (p != null) {
                        p.setCantidadDisponible(stock);
                        System.out.println("Stock actualizado!!!");
                    }
                    else {
                        System.out.println("Producto no encontrado!!");
                    }
                }

                case 5 -> {
                    System.out.println("OBTENER STOCK PRODUCTO");
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombre = sc.nextLine();
                    Producto p = gestor.buscarProducto(nombre);

                    if (p != null) {
                        System.out.println("Stock del producto: " + p.getCantidadDisponible());
                    }
                    else {
                        System.out.println("Producto no encontrado!!");
                    }
                }

                case 6 -> {
                    gestor.listarInventario();
                }
                case 7 -> {
                    System.out.println("Adios!!!");
                }
                default -> System.out.println("Opción no válida! Intenta nuevamente");
            }
            
        } while(opt != 7);
    }
    
    public static int mostrarMenu() {
        System.out.println("\nGESTOR DE INVENTARIO:");
        System.out.println("=====================");
        System.out.println(" 1. Agregar producto");
        System.out.println(" 2. Eliminar producto");
        System.out.println(" 3. Buscar producto");
        System.out.println(" 4. Actualizar stock producto");
        System.out.println(" 5. Obtener stock de producto");
        System.out.println(" 6. Listar productos");
        System.out.println(" 7. Salir");
        System.out.print(">>> Ingresa opción: ");
        int opt = sc.nextInt();
        sc.nextLine();
        return opt;
    }
}
