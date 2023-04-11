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
public class Smartphone extends DispositivoElectronico{
    private double pantalla;
    private String procesador;

    public Smartphone(String id, String nombre, String marca, double precio, int stock, int almacenamiento, double pantalla, String procesador){
        super(id, nombre, marca, precio, stock, almacenamiento);
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return super.toString() + "Smartphone{" + "pantalla=" + pantalla + ", procesador=" + procesador + '}';
    }
}
