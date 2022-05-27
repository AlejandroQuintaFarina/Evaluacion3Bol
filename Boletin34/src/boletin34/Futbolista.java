/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin34;

/**
 *
 * @author alex0
 */
public class Futbolista extends SeleccionFutbol{
    
    private Integer dorsal;
    private String demarcacion;
    
    public void entrevista(){
        
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrase o futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o partido o futbolista");
    }
    
}
