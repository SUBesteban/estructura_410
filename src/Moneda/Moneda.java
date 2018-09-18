/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moneda;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class Moneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int moneda = 0, j = 0,cartera=500,apuesta=0;
        String credito = "";

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        do {
            moneda = rnd.nextInt(2);
            
            System.out.println("Tu saldo actual es de: "+cartera+" ¿Cuanto deseas apostar?");
            apuesta=sc.nextInt();
            if(apuesta<=cartera){
                apuesta=apuesta;
            }else{
            apuesta=cartera;
            }
            
            System.out.println("Elige Sol (0)");
            System.out.println("Elige Aguila (1)");
            j = sc.nextInt();

            if (j == moneda) {
                System.out.println("Felicidades ya ganastes");
                cartera=cartera+apuesta;
            } else {
                System.out.println("Perdiste Suerte para la proxima");
                cartera=cartera-apuesta;
            }

            if (moneda == 0) {
                System.out.println("Cayo Sol " + moneda);

            } else {
                System.out.println("Cayo Aguila " + moneda);
            }

            System.out.println("Tu saldo actual es de: "+cartera);
            
            System.out.println("Continuar con el juego SI=(s), NO=(n)");
            credito = sc.next();
        } while (credito.equals("s")&& cartera>0);
    }

}
