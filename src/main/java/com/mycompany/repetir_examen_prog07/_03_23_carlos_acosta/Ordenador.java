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
public class Ordenador extends DispositivoElectronico{
    private double tamanio;
    private String tipo;
    private int ram;
    private boolean tarjetaGrafica;
    private ComponenteHardware[] hardware = new ComponenteHardware[10000];
    
    public Ordenador(String id, String nombre, String marca, double precio, int stock, int almacenamiento, double tamanio, String tipo, int ram, boolean tarjetaGrafic){
        super(id, nombre, marca, precio, stock, almacenamiento);
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.ram = ram;
        this.tarjetaGrafica = tarjetaGrafica;
    }
    
    public void insertarHardware(ComponenteHardware hardw){
        for (int i = 0; i < hardware.length; i++) {
            if (hardware[i] != null) {
                hardware[i] = hardw;
            }
        }
    }
    
    public void eliminaHardware(){
        for (int i = 0; i < hardware.length; i++) {
            if (hardware[i] != null) {
                hardware[i] = null;
            }
        }
    }
    
    public void mostrarHardw(){
        for (int i = 0; i < hardware.length; i++) {
            if (hardware[i] != null) {
                System.out.println(hardware[i]);
            }
        }
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public ComponenteHardware[] getHardware() {
        return hardware;
    }

    public void setHardware(ComponenteHardware[] hardware) {
        this.hardware = hardware;
    }

    @Override
    public String toString() {
        return super.toString() + "Ordenador{" + "tamanio=" + tamanio + ", tipo=" + tipo + ", ram=" + ram + ", tarjetaGrafica=" + tarjetaGrafica + ", hardware=" + hardware + '}';
    }

}
