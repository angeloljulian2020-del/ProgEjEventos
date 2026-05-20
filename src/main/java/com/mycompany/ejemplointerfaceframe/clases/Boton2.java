/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplointerfaceframe.clases;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author ASUS
 */
public class Boton2 {
    public static void main(String[] args) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        Button botonArea = new Button("Calcular área");
        Button botonPerimetro = new Button("Calcular Perimetro");
        miVentana.setSize(400, 200);
        miVentana.setTitle("Ventana con botones");
        miVentana.setVisible(true);
        miVentana.add(miPanel);
        miPanel.add(botonArea);
        miPanel.add(botonPerimetro);
}
}
