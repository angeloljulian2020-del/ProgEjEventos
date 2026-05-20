/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplointerfaceframe;

import com.mycompany.ejemplointerfaceframe.clases.EsquemaRaton;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;

/**
 *
 * @author ASUS
 */
public class EjemploInterfaceFrame {

    public static void main(String[] args) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        FlowLayout posicionamientoSecuencial = new FlowLayout();
        Button botonA = new Button("Primer botón");
        Button botonB = new Button("Segundo botón");
        Button botonC = new Button("Tercer botón");
        Button botonD = new Button("Cuarto botón");
        miPanel.setLayout(posicionamientoSecuencial);
        miVentana.add(miPanel);
        miPanel.add(botonA);
        miPanel.add(botonB);
        miPanel.add(botonC);
        miPanel.add(botonD);
        miVentana.setSize(300, 100);
        miVentana.setTitle("Ventana con flow layout");
        miVentana.setVisible(true);
        

        Frame miMarco = new Frame();
        miMarco.setSize(600, 400);
        miMarco.setTitle("Mi ventana de ejemplo");
        miMarco.setLocation(new Point(100, 220));
        miMarco.setVisible(true);
        //panel
        Panel panelMenuNorte = new Panel();
        Panel panelGeneral = new Panel();
        BorderLayout puntosCardinales = new BorderLayout();
        FlowLayout opcionesMenu = new FlowLayout();
        Button botonOpcion1 = new Button("Opción 1");
        Button botonOpcion2 = new Button("Opción 2");
        Button botonOpcion3 = new Button("Opción 3");
        Button botonSur = new Button("Sur");
        Button botonEste = new Button("Este");
        Button botonOeste = new Button("Oeste");
        Button botonCentro = new Button("Centro");
        panelGeneral.setLayout(puntosCardinales);
        panelMenuNorte.setLayout(opcionesMenu);
        miMarco.add(panelGeneral);
        panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
        panelMenuNorte.add(botonOpcion1);
        panelMenuNorte.add(botonOpcion2);
        panelMenuNorte.add(botonOpcion3);
        panelGeneral.add(botonSur, BorderLayout.SOUTH);
        panelGeneral.add(botonEste, BorderLayout.EAST);
        panelGeneral.add(botonOeste, BorderLayout.WEST);
        panelGeneral.add(botonCentro, BorderLayout.CENTER);
        miMarco.setSize(400, 150);
        miMarco.setTitle("Ventana con BorderLayout");
        miMarco.setVisible(true);
        
        //GrinLayout
            
        GridLayout matriz = new GridLayout(2, 3);
        Button[] botones = new Button[6];
        for (int i = 0; i < 6; i++)
            botones[i] = new Button("Botón " + i);
        miPanel.setLayout(matriz);
        for (int i = 0; i < 6; i++){
            miPanel.add(botones[i]);
            
        }
        miVentana.add(miPanel);
        miVentana.setSize(300, 100);
        miVentana.setTitle("Ventana con GridLayout");
        miVentana.setVisible(true);
        
        
        //Label
        Frame MiMarco = new Frame();
        Label Titulo = new Label ("Notas de Matematicas");
        
        MiMarco.add(Titulo);
        
        MiMarco.setSize(200,100);
        MiMarco.setTitle("Ventana con etiqueta");
        MiMarco.setVisible(true);
        
        //clase textfield
        
        Panel EntradaDeDatos = new Panel (new FlowLayout () ) ;
        TextField Nombre = new TextField ("Ingresa tu nombre ",15) ;
        TextField Apellidos = new TextField("Ingresa tu apellido",30);
        TextField Nacionalidad = new TextField ("Española", 15) ;

        EntradaDeDatos.add (Nombre) ;
        EntradaDeDatos.add (Apellidos);
        EntradaDeDatos.add (Nacionalidad) ;

        MiMarco.add (EntradaDeDatos);
        MiMarco.setSize (700,200);
        MiMarco.setTitle("Ventana con campos de texto");
        MiMarco.setVisible (true) ;
        //Botones
        Frame miVentan = new Frame("Ejemplo: Mouse listener");
        Panel miPane = new Panel();
        Button botonHola = new Button("Saludo");
        Button botonAdios = new Button("Despedida");
        miPane.add(botonHola);
        miPane.add(botonAdios);
        miVentan.add(miPane);
        miVentan.setSize(200, 100);
        miVentan.setVisible(true);
        botonHola.addMouseListener(new EsquemaRaton());
        botonAdios.addMouseListener(new EsquemaRaton());
        
        
        
}

}

