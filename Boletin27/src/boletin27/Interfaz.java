/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin27;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author alex0
 */
public class Interfaz {
    
    private JFrame marco;
    private JPanel panel;
    private JPanel panel2;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JList lista;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JTextField lineaTexto1;
    private JTextField lineaTexto2;
    private JTextArea textoArea;
    private JTextArea textoArea2;
    
    
    public void crearComponentes(){
        
        marco = new JFrame();
        panel = new JPanel();
        panel2 = new JPanel();
        etiqueta1 = new JLabel(" NOME ");
        etiqueta2 = new JLabel(" PASSWORD ");
        lineaTexto1 = new JTextField();
        lineaTexto2 = new JTextField();
        boton1 = new JButton(" PREMER ");
        boton2 = new JButton(" LIMPAR ");
        boton3 = new JButton ();
        textoArea = new JTextArea();
        textoArea2 = new JTextArea();
        
        panel.setLayout(null);
        panel2.setLayout(null);
        marco.setSize(1300, 650);
        marco.setBackground(Color.blue);
        panel.setSize(650,650);
        panel2.setSize(650,650);
        lineaTexto1.setBounds(300,75, 250,50);
        lineaTexto1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lineaTexto2.setBounds(300, 175, 250, 50);
        lineaTexto2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textoArea.setBounds(100, 300, 400, 100);
        textoArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textoArea2.setBounds(100, 300, 400, 100);
        textoArea2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        boton1.setBounds(125, 500, 150, 50);
        boton1.setBackground(Color.white);
        boton1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        boton2.setBounds(350,500,150,50);
        boton2.setBackground(Color.white);
        boton2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        boton3.setBounds(125, 500, 150, 50);
        boton3.setBackground(Color.white);
        boton3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiqueta1.setBounds(100, 5, 100, 200);
        etiqueta2.setBounds(100, 105, 100, 200);
        
        panel.add(lineaTexto1);
        panel.add(lineaTexto2);
        panel.add(textoArea);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        
        panel2.add(boton3);
        panel2.add(textoArea2);
               
       
        marco.add(panel);
        marco.add(panel2);
       
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
