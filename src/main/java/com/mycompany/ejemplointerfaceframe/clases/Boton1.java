/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplointerfaceframe.clases;

import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author ASUS
 */
public class Boton1 {
    public static void main(String[] args) {
        //Creamos una ventana nueva
        Frame miVentana = new Frame();
        //Creamos un boton nuevo
        Button botonHola = new Button("Hola");
        //Agregamos propiedades a ventana
        miVentana.setSize(400, 200);
        miVentana.setTitle("Ventana con botón");
        miVentana.setVisible(true);
        //Añadimos el baton a nuestra ventana
        miVentana.add(botonHola);

}
    
}
