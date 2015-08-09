/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum;

/**
 *
 * @author Michael
 */
public class Loop {
    public static void main(String[] args)
    {
        int idade = 15;
        while(idade < 18) {
            System.out.println(idade);
            idade += 1;
        }
        
        int multiplo = 2;
        int total = 10;
        for (int i = multiplo; i < total; i = i*multiplo) {
            System.out.println("Múltipos: " + i);
        }
        
        //Controlando loops
        for (int i = 5; i < 20; i++){
            if(i % 2 == 0) {
                System.out.println("Achei um número divisível por 2: " + i);
                break;
            }
        }
        
        for (int i = 0; i < 100; i++){
            if(i > 0 && i < 95) {
                continue;
            }
            
            System.out.println(i);
        }
    }
}
