/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Esteban
 */
public class array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int datos[];
        int t=0;
        
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        
        System.out.println("Inserte la longuitud del array:");
        t=sc.nextInt();
        
        datos=new int[t];
        
        for (int i = 0; i < datos.length; i++) {
            datos[i]=rnd.nextInt(100);
        }
        
        for (int i = 0; i < datos.length; i++) {
            System.out.println((i+1)+".- "+datos[i]);
        }
    
    }
    
}
