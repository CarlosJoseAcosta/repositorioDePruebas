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
public class Tienda {

    private DispositivoElectronico[] dispositivos = new DispositivoElectronico[500];
    //Aqui van los dispositivos en promocion donde solo van a ir los pc que el usuario introduzca
    private DispositivoElectronico[] promociones = new DispositivoElectronico[500];

    public Tienda() {
    }

    public int anadirProducto(DispositivoElectronico dispositivo) {
        int posicionVacia = -1;
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null && dispositivos[i].getId().equals(dispositivo.getId())) {
                return -1;
            } else if (dispositivos[i] == null) {
                posicionVacia = i;
            }
        }
        if (posicionVacia > -1) {
            dispositivos[posicionVacia] = dispositivo;
            return 1;
        }
        return 0;
    }

    public void listarDisp() {
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null) {
                System.out.println(dispositivos[i]);
            }
        }
    }

    public void buscarDisp(String nombreMarca) {
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null && dispositivos[i].getNombre().equals(nombreMarca) || dispositivos[i].getMarca().equals(nombreMarca)) {
                System.out.println(dispositivos[i]);
            }
        }
    }

    public boolean anadirHardware(String id, String tipo, String marca, String modelo) {
        ComponenteHardware componente = new ComponenteHardware(tipo, marca, modelo);
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null && dispositivos[i].getId().equals(id)) {
                ((Ordenador) dispositivos[i]).insertarHardware(componente);
                return true;
            }
        }
        return false;
    }

    public boolean eliminaUnDisp(String id) {
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null && dispositivos[i].getId().equals(id)) {
                if (dispositivos[i] instanceof Ordenador) {
                    ((Ordenador) dispositivos[i]).eliminaHardware();
                    dispositivos[i] = null;
                    return true;
                } else {
                    dispositivos = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean insercionAuto() {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (dispositivos[i] == null) {
                String id = "ABCDE" + i;
                String marca = "Nokia " + i + ".05";
                double precio = 1200;
                int stock = 1000;
                int almacenamiento = 50;
                double pantalla = 10;
                String procesador = "Nokia procesor";
                dispositivos[i] = new Smartphone(id, marca, marca, precio, stock, almacenamiento, pantalla, procesador);
                contador++;
            }
        }
        if (contador == 4) {
            return true;
        }
        return false;
    }

    public boolean listarPromociones(String nombre) {
        for (int i = 0; i < promociones.length; i++) {
            if (promociones[i] != null && promociones[i].getNombre().equals(nombre)) {
                for (int j = 0; j < dispositivos.length; j++) {
                    if (dispositivos[i] != null && dispositivos[j].getNombre().equals(nombre)) {
                        System.out.println(dispositivos[j]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean listarHardware(String nombre) {
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null && dispositivos[i].getNombre().equals(nombre) && dispositivos[i] instanceof Ordenador) {
                ((Ordenador) dispositivos[i]).mostrarHardw();
                return true;
            }
        }
        return false;
    }

    public int anadirPromocion(String id) {
        int posicionVacia = -1;
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null && dispositivos[i].getId().equals(id)) {
                for (int j = 0; j < promociones.length; j++) {
                    if (promociones[j] != null && promociones[j].getId().equals(id)) {
                        return -1;
                    } else if (promociones[j] == null) {
                        posicionVacia = j;
                    }
                }
                if (posicionVacia > -1) {
                    promociones[posicionVacia] = dispositivos[i];
                    promociones[posicionVacia].setPrecio(dispositivos[i].getPrecio() * 0.10);
                    return 1;
                }
            }
        }
        return 0;
    }

    public boolean eliminaPromociones(String id) {
        for (int i = 0; i < promociones.length; i++) {
            if (promociones[i] != null && promociones[i].getId().equals(id)) {
                promociones[i] = null;
                return true;
            }
        }
        return false;
    }

    public void buscaPCPorHardw(String modelo) {
        ComponenteHardware[] neoHardw = new ComponenteHardware[10000];
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] instanceof Ordenador && dispositivos[i] != null) {
                neoHardw = ((Ordenador) dispositivos[i]).getHardware();
                for (int j = 0; j < neoHardw.length; j++) {
                    if (neoHardw[i] != null && neoHardw[i].getModelo().equals(modelo)) {
                        System.out.println("El ordenador que tiene el modelo " + modelo + " se llama: " + dispositivos[i].getNombre());
                        return;
                    }
                }
            }
        }
        System.out.println("No se ha encontrado nada.");
        return;
    }

    public String elMasCaro() {
        double maxPrecioSmartphone = 0;
        double maxPrecioOrdenador = 0;
        int posicionSmart = -1;
        int posicionOrdenador = -1;
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null) {
                if (dispositivos[i].getPrecio() > maxPrecioSmartphone && dispositivos[i] instanceof Smartphone) {
                    maxPrecioSmartphone = dispositivos[i].getPrecio();
                    posicionSmart = i;
                } else if (dispositivos[i].getPrecio() > maxPrecioOrdenador && dispositivos[i] instanceof Ordenador) {
                    maxPrecioOrdenador = dispositivos[i].getPrecio();
                    posicionOrdenador = i;
                }
            }
        }
        if (maxPrecioSmartphone > 0 && maxPrecioOrdenador > 0) {
            return "El Smartphone con mayor precio es: " + dispositivos[posicionSmart].getNombre() + " y cuesta " + maxPrecioSmartphone + " euros y el Ordenador con maypr precio es: " + dispositivos[posicionOrdenador].getNombre() + " y cuesta " + maxPrecioOrdenador + " euros.";
        }
        return null;
    }

    public String elMasBarato() {
        double minPrecioSmarth = 99999;
        double minPrecioOrd = 99999;
        int posicionSmart = -1;
        int posicionOrd = -1;
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null) {
                if (dispositivos[i].getPrecio() < minPrecioSmarth && dispositivos[i] instanceof Smartphone) {
                    minPrecioSmarth = dispositivos[i].getPrecio();
                    posicionSmart = i;
                } else if (dispositivos[i].getPrecio() < minPrecioSmarth && dispositivos[i] instanceof Ordenador) {
                    minPrecioOrd = dispositivos[i].getPrecio();
                    posicionOrd = i;
                }
            }
        }
        if (minPrecioOrd < 99999 && minPrecioSmarth < 99999) {
            return "El Smartphone mas barato es: " + dispositivos[posicionSmart].getNombre() + " y cuesta " + minPrecioSmarth + " euros, y el ordenador mas barato es: " + dispositivos[posicionOrd].getNombre() + " y cuesta " + minPrecioOrd + " euros.";
        }
        return null;
    }

    public String media() {
        int contadorPc = 0;
        int contadorSmart = 0;
        double mediaSmart = 0;
        double mediaPC = 0;
        double totalSmart = 0;
        double totalPC = 0;
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null) {
                if (dispositivos[i] instanceof Smartphone) {
                    totalSmart = totalSmart + dispositivos[i].getPrecio();
                    contadorSmart++;
                } else if (dispositivos[i] instanceof Ordenador) {
                    totalPC = totalPC + dispositivos[i].getPrecio();
                    contadorPc++;
                }
            }
        }
        if (contadorPc > 0 && contadorSmart > 0) {
            mediaPC = totalPC / contadorPc;
            mediaSmart = totalSmart / contadorSmart;
            return "La media de precios de los smartphone es de: " + mediaSmart + "euros y la de los de Pc es de " + mediaPC + " euros";
        }
        return null;
    }

    public String[] busquedaAvanzadaTodo(String[] listaComponentes) {
        String[] ordenadores = new String[500];
        ComponenteHardware[] listaHardw;
        int contador = 0;
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] instanceof Ordenador) {
                listaHardw = ((Ordenador) dispositivos[i]).getHardware();
                for (int j = 0; j < listaHardw.length; j++) {
                    for (int k = 0; k < listaComponentes.length; k++) {
                        if (listaHardw[j] != null && listaComponentes[k] != null && listaComponentes[k].equals(listaHardw[j].getModelo())) {
                            contador++;
                        }
                    }
                }
            }
            if (contador == listaComponentes.length) {
                ordenadores[i] = dispositivos[i].getNombre();
            }
        }
        if (contador == listaComponentes.length) {
            return ordenadores;
        }
        return null;
    }

    public String[] busquedaAvanzadaMin3(String[] listaComponentes) {
        String[] ordenadores = new String[500];
        ComponenteHardware[] listaHardw;
        int contador = 0;
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] instanceof Ordenador) {
                listaHardw = ((Ordenador) dispositivos[i]).getHardware();
                for (int j = 0; j < listaHardw.length; j++) {
                    for (int k = 0; k < listaComponentes.length; k++) {
                        if (listaHardw[j] != null && listaComponentes[k] != null && listaComponentes[k].equals(listaHardw[j].getModelo())) {
                            contador++;
                        }
                    }
                }
            }
            if (contador > 3) {
                ordenadores[i] = dispositivos[i].getNombre();
            }
        }
        if (contador > 3) {
            return ordenadores;
        }
        return null;
    }

    public String[] busquedaAvanzadaNinguno(String[] listaComponentes) {
        String[] ordenadores = new String[500];
        ComponenteHardware[] listaHardw;
        int contador = 0;
        for (int i = 0; i < dispositivos.length; i++) {
            if (dispositivos[i] != null && dispositivos[i] instanceof Ordenador) {
                listaHardw = ((Ordenador)dispositivos[i]).getHardware();
                for (int j = 0; j < listaHardw.length; j++) {
                    for (int k = 0; k < listaComponentes.length; k++) {
                        if (listaHardw[j] != null && listaComponentes[k] != null && listaComponentes[k].equals(listaHardw[j].getModelo())) {
                            contador ++;
                        }
                    }
                }
            }
            if (contador == 0 && dispositivos[i] instanceof Ordenador) {
                ordenadores[i] = dispositivos[i].getNombre();
            }
        }
        if (contador == 0) {
            return ordenadores;
        }
        return null;
    }
}
