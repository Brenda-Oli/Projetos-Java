/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Brend
 */
public class CalculadoraSimples {
     public static void main(String[] args) {
        int n1, n2, s1, s2, m1, m2, d1, d2,total, op;
        
        Scanner entrada = new Scanner(System.in);     
        
        do{
            System.out.println("\n\t\t\t -- Calculadora --\n");
            
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            
            System.out.print("Opção: ");
            op = entrada.nextInt();
            
            if(op == 1){
                System.out.println("\n\t\t\t -- Soma --\n");
                System.out.print("Digite o primeiro número: ");
                n1 = entrada.nextInt();              
                System.out.print("Digite o segundo número: ");
                n2 = entrada.nextInt();
                
                total = n1 + n2;
                
                System.out.println("\n\n" + n1 + " + " + n2 + " = " + total);
            }else if(op == 2){
                System.out.println("\n\t\t\t -- Subtração --\n");
                System.out.print("Digite o primeiro número: ");
                s1 = entrada.nextInt();              
                System.out.print("Digite o segundo número: ");
                s2 = entrada.nextInt();
                
                total = s1 - s2;
                
                System.out.println("\n\n" + s1 + " - " + s2 + " = " + total);
            }else if(op == 3){
                System.out.println("\n\t\t\t -- Multiplicação --\n");
                System.out.print("Digite o primeiro número: ");
                m1 = entrada.nextInt();              
                System.out.print("Digite o segundo número: ");
                m2 = entrada.nextInt();
                
                total = m1 * m2;
                
                System.out.println("\n\n" + m1 + " * " + m2 + " = " + total);
            }else if(op == 4){
                System.out.println("\n\t\t\t -- Divisão --\n");
                System.out.print("Digite o primeiro número: ");
                d1 = entrada.nextInt();              
                System.out.print("Digite o segundo número: ");
                d2 = entrada.nextInt();
                
                total = d1 / d2;
                
                System.out.println("\n\n" + d1 + " / " + d2 + " = " + total);
            }else if(op == 5){
                System.out.print("Calculadora encerrada");
            }else{
                System.out.print("A opção " + op + " está incorreta!");
                }
            }while(op != 5);
    }
}
