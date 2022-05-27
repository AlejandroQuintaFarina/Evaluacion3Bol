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
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private Integer anosExperiencia;
    
    public void darMasaje(){
        
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrase o masaxista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o masaxista");
    }

    @Override
    public void entrenar() {
        System.out.println("Non entrena o masaxista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Non xoga o partido o masaxista");
    }
}
