/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin26;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author alex0
 */
public class Componentes implements ActionListener{
    
    private JFrame marco;
    private JPanel panel;
    private JButton boton1;
    private JButton boton2;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JTextField lineaTexto1;
    private JTextField lineaTexto2;
    private JTextArea textoArea;
    
    
    public void crearComponentes(){
        
        marco = new JFrame();
        panel = new JPanel();
        etiqueta1 = new JLabel(" NOME ");
        etiqueta2 = new JLabel(" PASSWORD ");
        lineaTexto1 = new JTextField();
        lineaTexto2 = new JTextField();
        boton1 = new JButton(" PREMER ");
        boton2 = new JButton(" LIMPAR ");
        textoArea = new JTextArea();
        
        panel.setLayout(null);
        marco.setSize(650, 650);
        marco.setBackground(Color.blue);
        panel.setSize(650,650);
        lineaTexto1.setBounds(300,75, 250,50);
        lineaTexto1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lineaTexto2.setBounds(300, 175, 250, 50);
        lineaTexto2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textoArea.setBounds(100, 300, 400, 100);
        textoArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        boton1.setBounds(125, 500, 150, 50);
        boton1.setBackground(Color.white);
        boton1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        boton2.setBounds(350,500,150,50);
        boton2.setBackground(Color.white);
        boton2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiqueta1.setBounds(100, 5, 100, 200);
        etiqueta2.setBounds(100, 105, 100, 200);
        
        panel.add(lineaTexto1);
        panel.add(lineaTexto2);
        panel.add(textoArea);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
               
       
        marco.add(panel);
       
        marco.setLocationRelativeTo(marco);
        
        //CUANDO APRETAMOS EL BOTON ESCRIBIR LO PONEMOS EN EL AREA DE TEXTO, Y EL BOTON LIMPIAR LIMPIAMOS EL AREA DE TEXTO
        
        boton1.addActionListener((ActionListener) this);
        boton2.addActionListener((ActionListener) this);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object ob = ae.getSource();
        
        if(ob==boton2){
            textoArea.setText(" ");
        }
        else if (ob==boton1){
            textoArea.setText("Hola"+ lineaTexto1);
        }   
    }
}
