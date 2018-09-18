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
public class Temperaturas {

    public Grados temperaturas[];
    

    Temperaturas() {
        temperaturas = new Grados[7];
        
    }

    public void addTemperaturas(int posicion, Grados x) {
        this.temperaturas[posicion] = x;
    }

    public float getMaxima() {
        float maxima = 0;
     
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i].getMaximo() > maxima) {
                maxima = temperaturas[i].getMaximo();
                
            }
        }
        return maxima;
    }

    public float getPromedioMaximo() {
        float prom = 0;
        for (int i = 0; i < 7; i++) {
            prom += temperaturas[i].getMaximo();
        }
        return prom / 7;
    }

    public float getMinima() {
        float minima = temperaturas[0].getMinimo();
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i].getMinimo() < minima) {
                minima = temperaturas[i].getMinimo();
            }
        }
        return minima;
    }

    public float getPromedioMinimo() {
        float prom = 0;
        for (int i = 0; i < 7; i++) {
            prom += temperaturas[i].getMinimo();
        }
        return prom / 7;
    }
}
