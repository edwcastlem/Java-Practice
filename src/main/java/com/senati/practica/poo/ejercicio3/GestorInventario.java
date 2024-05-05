package com.senati.practica.poo.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class GestorInventario {
    private List<Producto> inventario;

    public GestorInventario() {
        inventario = new ArrayList<Producto>();
    }
    
    public void agregarProducto(Producto p) {
        inventario.add(p);
        System.out.println("Producto agregado con éxito!!");
    }
    
    public void eliminarProducto(String nombre) {
        for(Producto p : inventario) {
            if (p.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                inventario.remove(p);
                System.out.println("Se eliminó el producto: " + nombre);
                break;
            }
        }
        System.out.println("No se encontró el producto a eliminar!");
    }
            
    public Producto buscarProducto(String nombre) {
        for(Producto p : inventario) {
            if (p.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                return p;
            }
        }
        return null;
    }
    
    public int obtenerCantidadDisponible(String nombre) {
        for(Producto p : inventario) {
            if (p.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                return p.getCantidadDisponible();
            }
        }
        return -1;  // no encontro el producto
    }
    
    public void listarInventario() {
        System.out.println("INVENTARIO");
        System.out.println("----------");
        if (inventario.size() > 0) {
            for(Producto p : inventario) {
                System.out.println(p);
            }
            System.out.println("\nTOTAL DE PRODUCTOS: %d".formatted(inventario.size()));
        }
        else {
            System.out.println("NO HAY PRODUCTOS EN EL INVENTARIO!!");
        }
    }
}
