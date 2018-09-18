/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clima;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Clima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        Temperaturas t=new Temperaturas();
        String dias[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        for (int i=0;i<7;i++) {
            Grados g=new Grados();
            System.out.println("Inserta la temperatura Maxima del dia: "+dias[i]);
            g.setMaximo(sc.nextFloat());
            System.out.println("Inserta la temperatura Minima del dia: "+dias[i]);
            g.setMinimo(sc.nextFloat());
            t.addTemperaturas(i, g);
            
        }
        System.out.println("Temperatura maxima de la semana: "+t.getMaxima());
        System.out.println("Temperatura minima de la semana: "+t.getMinima());
        System.out.println("----------------------------------------------------");
        System.out.println("Temperatura promedio maximo de la semana fue de: "+t.getPromedioMaximo());
        System.out.println("Temperatura promedio minimo de la semana fue de: "+t.getPromedioMinimo());
        
    }
    
}
