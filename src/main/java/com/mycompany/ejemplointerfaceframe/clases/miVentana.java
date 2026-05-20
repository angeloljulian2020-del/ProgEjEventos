/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplointerfaceframe.clases;
import java.awt.Frame;
import java.awt.Point;

/**
 *
 * @author ASUSextends Frame{
    this.setTitulo(String titulo);
    this.setVisible(true);
    
    
  
 */
public class miVentana extends Frame{
    
    public miVentana(String titulo){
        this.setTitle(titulo);
        this.setVisible(true);
    }
    public miVentana(String titulo, int ancho, int alto){
        this(titulo);
        this.setSize(ancho, alto);
    }
    public miVentana(){
        this("Mi Ventana", 600, 400);
    }
    public miVentana(String titulo, int ancho, int alto, int posX, int posY) {
        this(titulo,ancho,alto);
        this.setLocation(new Point(posX, posY));
}
}
    

