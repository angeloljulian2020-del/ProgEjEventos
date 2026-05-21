/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplointerfaceframe.clases;

import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author ASUS
 */
public class InterrupcionesDeElemento implements ItemListener{
    @Override
    public void itemStateChanged(ItemEvent evento) {
        Checkbox componente = (Checkbox) evento.getSource();
        boolean estado = componente.getState();
        int nuevoEstado = evento.getStateChange();
        System.out.println("Componente: " + evento.getItem());
        System.out.println("Estado actual: " + estado);
        if (nuevoEstado == ItemEvent.SELECTED) {
            System.out.println("Seleccionado");
        } else {
            System.out.println(" No seleccionado");
        }
        System.out.println();
    }
    
}
