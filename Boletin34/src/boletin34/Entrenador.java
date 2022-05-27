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
public class Entrenador extends SeleccionFutbol{
    
    private Integer idFederacion;
    
    public void planificarEntrenamiento(){
        
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrase o entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Non xoga o partido o entrenador");
    }
    
}
