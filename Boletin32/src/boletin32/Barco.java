/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

/**
 *
 * @author alex0
 */
public abstract class Barco {
    
    private String matricula;
    private int eslora;
    private float precio;

    public Barco() {
    }

    public Barco(String matricula, int eslora, float precio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return  "matricula=" + matricula + ", eslora=" + eslora + ", precio=" + precio;
    }
    
}
