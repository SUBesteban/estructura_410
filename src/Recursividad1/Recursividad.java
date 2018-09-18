/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad1;

/**
 *
 * @author Esteban
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaracion de variable n con valor 5
        int n=5;
        
        //impresion del factorial en valor n 
        System.out.println(factorial(n));
    }
    
    //Creacion del metodo factorial
    static int factorial(int n){
       //Validacion del valor en n
        if(n==0){
        //En caso de que n tenga valor de 0 regresa el valor de 1
       return 1;  
       //Validacion en caso de que n tenga valor que no sea 0
       }else{
       //En caso de que n tenga valor aplica la recursividad de este metodo n veces 
       return n*factorial(n-1);
       }
}
    
}
