/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinta.feira;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class QuintaFeira {

    /**
     * @param args the command line arguments
     * 
     */

    public static void main (String[] args){
        // TODO code application logic here
       
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int n = leia.nextInt();
        int i = 0;
        int result = 0;
        while (i <= n){
            result +=i;
            i++;
        }
        System.out.print("o resultado é = " + result);
        
        
            
    }

    /**
     *
     * @param args
     */
    public static void socorro(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número ai: ");
         int n = leia.nextInt();
        if(n=1){
        System.out.print("Vasco da Gama");
}
    }
