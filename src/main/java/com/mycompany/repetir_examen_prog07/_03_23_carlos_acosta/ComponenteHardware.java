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
public class ComponenteHardware {
    private String tipo;
    private String marca;
    private String modelo;

    public ComponenteHardware(String tipo, String marca, String modelo){
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "ComponenteHardware{" + "tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
}
