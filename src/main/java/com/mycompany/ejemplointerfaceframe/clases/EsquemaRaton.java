/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplointerfaceframe.clases;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ASUS
 */
public class EsquemaRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        //Aqui se implementa la acion deseada
        
        Frame ventanaB = new Frame();
        Panel miPanex = new Panel();
        ventanaB.add(miPanex);
        ventanaB.setSize(300, 100);
        ventanaB.setTitle("New bentana");
        ventanaB.setVisible(true);
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        e.getComponent().setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().
            setBackground(Color.gray);
    }
    
    
}
