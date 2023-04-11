/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repetir_examen_prog07._03_23_carlos_acosta;

/**
 *
 * @author 1daw14
 */
public class DispositivoElectronico {
    private String id;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;
    private int almacenamiento;

    public DispositivoElectronico(String id, String nombre, String marca, double precio, int stock, int almacenamiento){
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.almacenamiento = almacenamiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", stock=" + stock + ", almacenamiento=" + almacenamiento + '}';
    }
}
