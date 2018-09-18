/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruleta;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Esteban
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        String numeros[] = new String[32];
        int apuesta = 0, cartera = 500, cantidad = 0, resultado = 0;
        int tipo = 0;//Tipo de apuesta puede ser numero=0 o color=1

        numeros[0] = "Verde";

        for (int i = 1; i < 32; i++) {
            if (i % 2 == 0) {
                numeros[i] = "Negro";
            } else {
                numeros[i] = "Rojo";
            }
        }
        for (int i = 0; i < 32; i++) {
            System.out.println(i + ".- " + numeros[i]);
        }

        System.out.println("Tu credito es de: " + cartera);
        System.out.println("¿Quiers apostar a un numero=0 o un color=1 ?");
        tipo = sc.nextInt();
        if (tipo == 0) {
            System.out.println("Selecciona un numero entre 0 y 31");
            apuesta = sc.nextInt();
        } else {
            System.out.println("Selecciona un color Verde=0, Rojo=1, Negro=2");
            apuesta = sc.nextInt();
        }
        System.out.println("¿Cuanto quieres perder?");
        cantidad = sc.nextInt();

        resultado = rnd.nextInt(32);

        System.out.println("Resultado: " + resultado);
        System.out.println("Color: " + numeros[resultado]);

        if (tipo == 0) {

            if (resultado == apuesta) {
                cartera = (cartera + cantidad * 32);
                System.out.println("Felicidades :D");
            } else {
                cartera = cartera - cantidad;
                System.out.println("Suerte para la proxima :(");
            }
        } else {
            switch(apuesta){
                case 0:
                    if (numeros[resultado].equals("Verde")) {
                        cartera=cartera+cantidad;
                    }else{
                    cartera=cartera-cantidad;
                    }
                    break;
                case 1:
                    if (numeros[resultado].equals("Rojo")) {
                        cartera=cartera+cantidad;
                    }else{
                    cartera=cartera-cantidad;
                    }
                    break;
                case 2:
                    if (numeros[resultado].equals("Negro")) {
                        cartera=cartera+cantidad;
                    }else{
                    cartera=cartera-cantidad;
                    }
                    break;
            }
        }
        System.out.println("Tu credito actual es de: " + cartera);
    }

}
