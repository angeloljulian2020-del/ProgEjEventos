/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplointerfaceframe.clases;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author ASUS
 */
public class InterrupcionesDeVentana  implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName() + " abierta");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Si pulsas aqui se cierra la ventana " + e.getWindow().getName());
        System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName()+ " cerrada");
    }
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName()+ " activa (en uso)");
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName()+ " desactivada (fuera de uso)");
    }
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName()+ " minimizada");
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName()+ " restaurada");
    }
    
}
