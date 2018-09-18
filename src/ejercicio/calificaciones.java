/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class calificaciones {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float max[]=new float[5];
        float min[]=new float[5];
        float cmax=0,cmin=0,pmax=0,pmin=0;
        int mmax=0,mmin=0;
        String materias[]={"Ingenieria de Software","Desarrollo de aplicaciones","Estructura de datos","Administracion de BD","Ingles","Formacion Sociocultural"};
        
        Scanner sc=new Scanner(System.in);   
        
        for (int i=0;i<5; i++) {
            System.out.println("Inserte la calificacion maxima para la materia:"+materias[i]);
            max[i]=sc.nextFloat();
            pmax=pmax+max[i];
            if (max[i]>cmax){
                cmax=max[i];
                mmax=i;
            }
            
            System.out.println("Inserte la calificacion minima para la materia:"+materias[i]);
            min[i]=sc.nextFloat();
            pmin=pmin+min[i];
            if (i==0){
                cmin=min[i];
                mmin=i;
            }else if(min[i]<cmin){
            cmin=min[i];
                mmin=i;
            }
        }
        for (int i=0;i<5;i++) {
            System.out.println("La calificacion maxima para la materia: "+materias[i]+" es de "+max[i]);
            System.out.println("La calificacion minima para la materia: "+materias[i]+" es de "+min[i]);
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("La calificacion maxima fue de: "+cmax+" en la materia "+materias[mmax]);
        System.out.println("La calificacion minima fue de: "+cmin+" en la materia " +materias[mmin]);
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("El promedio de las calificaciones maximas fue de: "+pmax/max.length);
        System.out.println("El promedio de las calificaciones minimas fue de: "+pmin/min.length);
       
    }
    
}
