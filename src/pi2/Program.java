/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi2;

import java.util.Scanner;

/**
 *
 * @author kelly.fsantos8
 */
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        //ENTRADAS
        System.out.println("x1 = ");
        double x1 = leitor.nextDouble();
        System.out.println("x2 = ");
        double x2 = leitor.nextDouble();
        System.out.println("c = ");
        double c = leitor.nextDouble();
        
        //PROCESSAMENTO
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = - (a * s);
        
        //SAÍDAS
        System.out.println(a + "x²" + b + "x + " + c + " = 0");
        
        
                
               
                
        
        
        
        
        
        
    }
}
