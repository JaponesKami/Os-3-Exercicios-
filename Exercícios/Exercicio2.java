/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = leitor.nextInt();
        int result = num;
        int i = 1;
        while(num > 0){
            System.out.println("Digite outro valor");
            num = leitor.nextInt();
            
            if(num > 0){
                result += num;
                i++;
            }      
        }
        System.out.println("A media foi: " + (result / i));
    }
        
        
    }
    
}
