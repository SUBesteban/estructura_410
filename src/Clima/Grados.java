/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clima;

/**
 *
 * @author Esteban
 */
public class Grados {
    
    private float maximo,minimo;
    
    Grados(){
        maximo=0;
        minimo=0;

    }
    
    public void setMaximo(float x){
    this.maximo=x;
    }
    
    public float getMaximo(){
    return this.maximo;
    }
    
    public void setMinimo(float x){
    this.minimo=x;
    }
    
    public float getMinimo(){
    return this.minimo;
    }
}
