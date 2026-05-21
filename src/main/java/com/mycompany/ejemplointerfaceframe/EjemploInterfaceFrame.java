/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplointerfaceframe;

import com.mycompany.ejemplointerfaceframe.clases.EsquemaRaton;
import com.mycompany.ejemplointerfaceframe.clases.InterrupcionesDeAccion;
import com.mycompany.ejemplointerfaceframe.clases.InterrupcionesDeElemento;
import com.mycompany.ejemplointerfaceframe.clases.InterrupcionesDeEnfoque;
import com.mycompany.ejemplointerfaceframe.clases.InterrupcionesDeRaton;
import com.mycompany.ejemplointerfaceframe.clases.InterrupcionesDeTeclado;
import com.mycompany.ejemplointerfaceframe.clases.InterrupcionesDeVentana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
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
        //Ejemplo mouseAdapter
        final int NUM_OPCIONES = 12;
        Label mensaje = new Label("Mensaje asociado al botón pulsado");
        Button[] boton = new Button[NUM_OPCIONES];
        for (int i = 0; i < NUM_OPCIONES; i++) {
            boton[i] = new Button("Opcion " + i);
        if (i < 10) {
            boton[i].setName("0" + i);
        } else {
            boton[i].setName(String.valueOf(i));
        }
        }
        Frame miVentanota = new Frame("Prueba eventos de raton: MouseAdapter");
        Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES + 1, 1));
        panelPrincipal.add(mensaje);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            panelPrincipal.add(boton[i]);
        }
        miVentanota.add(panelPrincipal);
        miVentanota.setSize(400, 600);
        miVentanota.setVisible(true);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            boton[i].addMouseListener(new InterrupcionesDeRaton(mensaje));
        }
        //keyadapter
        Frame miVentanas = new Frame("Prueba eventos de raton: KeyAdapter");
        Panel miPanels = new Panel();
        Button boton1 = new Button("Silencio");
        Button boton2 = new Button("Máquina de escribir");
        miPanels.add(boton1);
        miPanels.add(boton2);
        miVentanas.add(miPanel);
        miVentanas.setSize(400, 400);
        miVentanas.setVisible(true);
        boton2.addKeyListener(new InterrupcionesDeTeclado());
        
        //WindowListener
        Frame miVentana2 = new Frame("Prueba eventos de ventana: WindowListener");
        miVentana2.setSize(200, 100);
        miVentana2.setVisible(true);
        Frame otraVentana = new Frame("Prueba eventos de ventana");
        otraVentana.setSize(100, 50);
        otraVentana.setLocation(200, 0);
        otraVentana.setVisible(true);
        miVentana.addWindowListener(new InterrupcionesDeVentana());
        otraVentana.addWindowListener(new InterrupcionesDeVentana());
        
        //ActionListener
        Frame miVentana3 = new Frame("Prueba eventos de acción: ActionListener");
        Panel miPanelotes = new Panel(new GridLayout(3, 1));
        Button botonas = new Button("Etiqueta del boton");
        TextField campoDeTexto = new TextField("Texto del campo 8");
        List lista = new List(3);
        lista.add("Opcion 1 de la lista");
        lista.add("Opcion 2 de la lista");
        lista.add("Opcion 3 de la lista");
        lista.add("Opcion 4 de la lista");
        miPanelotes.add(botonas);
        miPanelotes.add(campoDeTexto);
        miPanelotes.add(lista);
        botonas.addActionListener(new InterrupcionesDeAccion());
        campoDeTexto.addActionListener(new InterrupcionesDeAccion());
        lista.addActionListener(new InterrupcionesDeAccion());
        miVentana3.add(miPanel);
        miVentana3.setSize(400, 200);
        miVentana3.setVisible(true);
        
        //FocusListener
        Frame miVen = new Frame("Prueba eventos de enfoque");
        Panel miPanl = new Panel();
        Button bot1 = new Button("Componente 1");
        Button bot2 = new Button("Componente 2");
        miPanel.add(bot1);
        miPanel.add(bot2);
        miVen.add(miPanl);
        miVen.setSize(300, 200);
        miVen.setVisible(true);
        bot2.addFocusListener(new InterrupcionesDeEnfoque());
        
        //ItemListener
        Frame miVent = new Frame("Prueba eventos de elemento");
        Panel miPan = new Panel(new GridLayout(4, 1));
        Checkbox diesel = new Checkbox("Diesel", true);
        Checkbox farosXenon = new Checkbox("Faros de Xenon", false);
        Checkbox llantasAleacion = new Checkbox("Llantas de aleacion", false);
        Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada", true);
        miPan.add(diesel);
        miPan.add(farosXenon);
        miPan.add(llantasAleacion);
        miPan.add(pinturaMetalizada);
        diesel.addItemListener(new InterrupcionesDeElemento());
        farosXenon.addItemListener(new InterrupcionesDeElemento());
        llantasAleacion.addItemListener(new InterrupcionesDeElemento());
        pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());
        miVent.add(miPanel);
        miVent.setSize(400, 200);
        miVent.setVisible(true);
    }
}


        





