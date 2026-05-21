/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplointerfaceframe.clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author ASUS
 */
public class InterrupcionesDeRaton extends MouseAdapter{
    private Label mensaje;
    
    public InterrupcionesDeRaton(Label mensaje) {
        this.mensaje = mensaje;
    }
    @Override
    public void mouseClicked(MouseEvent evento) {
        Component componente = (Component) evento.getSource();
        String nombre = componente.getName();
        String opcion = nombre.substring(nombre.length() - 2, nombre.length());
        mensaje.setText("Ejecutar la accion " + opcion);
    }
    @Override
    public void mouseEntered(MouseEvent evento) {
        Component componente = (Component) evento.getSource();
        componente.setBackground(Color.red);
    }
    @Override
    public void mouseExited(MouseEvent evento) {
        Component componente = (Component) evento.getSource();
        componente.setBackground(Color.orange);
    }
}
    

