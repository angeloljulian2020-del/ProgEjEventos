/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplointerfaceframe.clases;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author ASUS
 */
public class InterrupcionesDeTeclado extends KeyAdapter{
    public void keyTyped(KeyEvent e) {
        System.out.print(e.getKeyChar());
        if (e.getKeyChar() == '*') {
            System.exit(0);
        }
    }
    
}
