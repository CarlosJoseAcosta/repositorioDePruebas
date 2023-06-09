/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repetir_examen_prog07._03_23_carlos_acosta;

import java.util.Scanner;

/**
 *
 * @author 1daw14
 */
public class TiendaPrincipal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Tienda tienda = new Tienda();
        int limite = 0;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ver listado de dispositivos");
            System.out.println("2. Buscar dispositivo");
            System.out.println("3. Anadir dispositivo");
            System.out.println("4. Anadir hardware a un PC");
            System.out.println("5. Eliminar dispositivo");
            System.out.println("6. Insertar de forma automatizada 5 de diferentes tipos de dispositivos.");
            System.out.println("7. Listar dispositivos en promociones");
            System.out.println("8. Mostrar los dispositivos hardware de un determinado dispositivo Electrónico.");
            System.out.println("9. Anadir dispositivos a una promoción de un determinado dispositivo electrónico por id");
            System.out.println("10. Quitar dispositivos de una promoción por id, de un determinado PC.");
            System.out.println("11. Buscar los pc que contengan un determinado componente hardware por modelo del harware");
            System.out.println("12. Calcular el dispositivo más caro por categoría");
            System.out.println("13. Calcular el dispositivo más barato por categoría");
            System.out.println("14. Calcular el precio medio de dispositivo por categoría");
            //Segundo, tercer, cuarto y quinto ejercicio
            System.out.println("15) Busqueda avanzada donde busca pc que tienen los componenetes dados por usted en una lista");
            System.out.println("16) Busqueda avanzada donde busca pc que tienen minimo 3 componenetes dados por usted en una lista");
            System.out.println("17) Busqueda avanzada donde busca pc que no tienen los componenetes dados por usted en una lista");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 0:
                    limite++;
                    break;
                case 1:
                    tienda.listarDisp();
                    break;
                case 2:
                    System.out.println("Ponga el nombre o la marca del dispositivo que esta buscando: ");
                    String nombMarc = teclado.nextLine();
                    
                    break;
                case 3:
                    System.out.println("1. smarphone");
                    System.out.println("2. ordenador");
                    System.out.println("Que dispositivo desea poner: ");
                    int desicion = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("id del dispositivo: ");
                    String id = teclado.nextLine();
                    System.out.println("Nombre del dispositivo: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Marca del dispositivo: ");
                    String marca = teclado.nextLine();
                    System.out.println("Precio del dispositivo: ");
                    double precio = teclado.nextDouble();
                    System.out.println("Stock del dispositivo");
                    int stock = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Capacidad de almacenamiento: ");
                    int almacenamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Tamanio del dispositivo: ");
                    switch (desicion) {
                        case 1:
                            double tamanio = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("Modelo del procesador: ");
                            String modelo = teclado.nextLine();
                            Smartphone smarphone = new Smartphone(id, nombre, marca, precio, stock, almacenamiento, tamanio, modelo);
                            int comprobante = tienda.anadirProducto(smarphone);
                            if (comprobante == -1) {
                                System.out.println("La Id del producto ya esta registrada por la cual deducimos que este dispositivo esta registrado.");
                            }else if(comprobante == 0){
                                System.out.println("La lista ya esta llena le recomendamos eliminar un producto o ponerse en contacto con su programador de confianza.");
                            }else if(comprobante == 1){
                                System.out.println("El Smartphone ha sido registrado con exito.");
                            }
                            break;
                        case 2:
                            String tipo = "";
                            System.out.println("Tamanio del dispositivo:");
                            tamanio = teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("1. portatil");
                            System.out.println("2. sobremesa");
                            System.out.println("que tipo: ");
                            desicion = teclado.nextInt();
                            teclado.nextLine();
                            if (desicion == 1) {
                                tipo = "portatil";
                            } else {
                                tipo = "torre";
                            }
                            System.out.println("Cuanta ram?: ");
                            int ram = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Tiene tarjeta grafica? (true/ false)");
                            boolean grafica = teclado.nextBoolean();
                            Ordenador pc = new Ordenador(id, nombre, marca, precio, stock, almacenamiento, tamanio, tipo, ram, grafica);
                            comprobante = tienda.anadirProducto(pc);
                            if (comprobante == -1) {
                                System.out.println("La Id del producto ya esta registrada por la cual deducimos que este dispositivo esta registrado.");
                            }else if(comprobante == 0){
                                System.out.println("La lista ya esta llena le recomendamos eliminar un producto o ponerse en contacto con su programador de confianza.");
                            }else if(comprobante == 1){
                                System.out.println("El ordenador ha sido registrado con exito.");
                            }
                    }
                    break;
                case 4:
                    System.out.println("Introduzca la id del ordenador a la que quiera introducir nuevo hardware");
                    id = teclado.nextLine();
                    System.out.println("Indique el tipo del hardware que va a poner:");
                    String tipoHardw = teclado.nextLine();
                    System.out.println("Indique la marca del hardware que va a introducir:");
                    String marcaHardw = teclado.nextLine();
                    System.out.println("Indique el modelo: ");
                    String modeloHW = teclado.nextLine();
                    if (tienda.anadirHardware(id, tipoHardw, marcaHardw, modeloHW)) {
                        System.out.println("Se ha insertado correctamente");
                    }else{
                        System.out.println("Ha ocurrido un error, vuelva a intentarlo");
                    }
                    break;
                case 5:
                    System.out.println("Pon la id del dispositivo que desea eliminar: ");
                    id = teclado.nextLine();
                    if (tienda.eliminaUnDisp(id)) {
                        System.out.println("Se ha eliminado con exito");
                    }else{
                        System.out.println("Ha ocurrido un error, por favor intentelo mas tarde:");
                    }
                    break;
                case 6:
                    if (tienda.insercionAuto()) {
                        System.out.println("Se han insertado de forma automatica cinco dispositivos Smartphone.");
                    }else{
                        System.out.println("No se han podido insertar cinco dispositivos.");
                    }
                    break;
                case 7:
                    System.out.println("Ponga el nombre del dispositivo que quiera ver su informacion y que este en promocion.");
                    nombre = teclado.nextLine();
                    if (tienda.listarPromociones(nombre)) {
                        System.out.println("");
                    }else{
                        System.out.println("El dispositivo que busca no está en promoción");
                    }
                    break;
                case 8:
                    System.out.println("Ponga el nombre del ordenador que desea ver sus compoonentes de hardware: ");
                    nombre = teclado.nextLine();
                    if (tienda.listarHardware(nombre)) {
                        System.out.println("");
                    }else{
                        System.out.println("No se ha encontrado el hardware o el dispositivo");
                    }
                    break;
                case 9:
                    System.out.println("Ponga la id del dispositivo que desea anadir a promociones");
                    id = teclado.nextLine();
                    int resultadoPromocion = tienda.anadirPromocion(id);
                    if (resultadoPromocion == -1) {
                        System.out.println("El producto ya esta en promocion.");
                    }else if (resultadoPromocion == 0) {
                        System.out.println("Ha ocurrido un error.");
                    }else if (resultadoPromocion == 1) {
                        System.out.println("El producto se ha insertado en promocion correctamente");
                    }
                    break;
                case 10:
                    System.out.println("Ponga la id del producto que desea eliminar: ");
                    id = teclado.nextLine();
                    if (tienda.eliminaPromociones(id)) {
                        System.out.println("Se ha eliminado la promocion con exito");
                    }else{
                        System.out.println("No se ha podido encontrar la promocion que se desea eliminar");
                    }
                    break;
                case 11:
                    System.out.println("Ponga el modelo del hardware");
                    modeloHW = teclado.nextLine();
                    tienda.buscaPCPorHardw(modeloHW);
                    break;
                case 12:
                    String mayorPrecio = tienda.elMasCaro();
                    if (mayorPrecio != null) {
                        System.out.println(mayorPrecio);
                    }else{
                        System.out.println("Ha ocurrido un error");
                    }
                    break;
                case 13:
                    String menorPrecio = tienda.elMasBarato();
                    if (menorPrecio != null) {
                        System.out.println(menorPrecio);
                    }else{
                        System.out.println("Ha ocurrido un error");
                    }
                    break;
                case 14:
                    String media = tienda.media();
                    if (media != null) {
                        System.out.println(media);
                    }else{
                        System.out.println("Ha ocurrido un error");
                    }
                    break;
                case 15:
                    String[] listaComponentes = new String[10];
                    String[] ordenadores;
                    int contador = 0;
                    for (int i = 0; i < listaComponentes.length; i++) {
                        System.out.println("Pon el componente del ordenador que desea buscar (Si desea parar no ponga nada):");
                        modeloHW = teclado.nextLine();
                        if (modeloHW != "") {
                            listaComponentes[i] = modeloHW;
                            contador ++;
                        }else if (modeloHW == "") {
                            i = 10;
                        }
                    }
                    if (contador >= 3) {
                        ordenadores = tienda.busquedaAvanzadaTodo(listaComponentes);
                        System.out.println("Los ordenadores que tienen todos estos compo");
                        for (int i = 0; i < ordenadores.length; i++) {
                            if (ordenadores[i] != null) {
                                System.out.println(ordenadores);
                            }
                        }
                    }else if (contador < 3) {
                        System.out.println("Tiene que poner un minimo de tres componentes para realizar la busqueda avanzada");
                    }
                    break;
                case 16:
                    listaComponentes = new String[10];
                    contador = 0;
                    for (int i = 0; i < listaComponentes.length; i++) {
                        System.out.println("Pon el componente del ordenador que desea buscar (Si desea parar no ponga nada):");
                        modeloHW = teclado.nextLine();
                        if (modeloHW != "") {
                            listaComponentes[i] = modeloHW;
                            contador ++;
                        }else if (modeloHW == "") {
                            i = 10;
                        }
                    }
                    if (contador >= 3) {
                        ordenadores = tienda.busquedaAvanzadaMin3(listaComponentes);
                        System.out.println("Los ordenadores que tienen todos estos componentes");
                        for (int i = 0; i < ordenadores.length; i++) {
                            if (ordenadores[i] != null) {
                                System.out.println(ordenadores[i]);
                            }
                        }
                    }else if (contador < 3) {
                        System.out.println("Tiene que poner un minimo de tres componentes para realizar la busqueda avanzada");
                    }
                    break;
                case 17:
                    listaComponentes = new String[10];
                    contador = 0;
                    for (int i = 0; i < listaComponentes.length; i++) {
                        System.out.println("Pon el componente del ordenador que desea buscar (Si desea parar no ponga nada):");
                        modeloHW = teclado.nextLine();
                        if (modeloHW != "") {
                            listaComponentes[i] = modeloHW;
                            contador ++;
                        }else if (modeloHW == "") {
                            i = 10;
                        }
                    }
                    if (contador >= 3) {
                        ordenadores = tienda.busquedaAvanzadaNinguno(listaComponentes);
                        System.out.println("Los equipos que no tienen ningun equipo");
                        for (int i = 0; i < ordenadores.length; i++) {
                            System.out.println(ordenadores[i]);
                        }
                    }else if(contador < 3){
                        System.out.println("Tiene que poner un minimo de 3 componentes para realizar la busqueda avanzada");
                    }
                break;
                default:
                    System.out.println("Esta opcion no se esperaba, por favor elija otra opcion.");
                    break;
            }
        } while (limite == 0);

    }
}
