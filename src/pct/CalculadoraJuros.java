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
public class CalculadoraJuros {
     public static void main(String[] args) {
        float valorS, taxaS, jurosFinalS, valorFinalS, valorC, taxaC, jurosFinalC, valorFinalC ;
        int opcao, periodoS, periodoC;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("\n\n\t\t\t - Calculadora de Juros - \n");
            System.out.println("1. Juros Simples");
            System.out.println("2. Juros Compostos");
            System.out.println("3. Sair");
            System.out.print("\n Opção: ");
            opcao = entrada.nextInt();

            if(opcao == 1){
                System.out.println("\n\t\t\t - Juros Simples - \n");

                System.out.print("Digite o valor: ");
                valorS = entrada.nextFloat();
                System.out.print("Digite a taxa de juros: ");
                taxaS = entrada.nextFloat();
                System.out.print("Digite o período: ");
                periodoS = entrada.nextInt();

                jurosFinalS = valorS * (taxaS/100) * periodoS;
                valorFinalS = jurosFinalS + valorS;

                System.out.println("O juros calculado é igual a " + jurosFinalS);
                System.out.println("O valor final calculado é igual a " + valorFinalS);
            }else if(opcao == 2){
                System.out.println("\n\t\t\t - Juros Compostos - \n");

                System.out.print("Digite o valor: ");
                valorC = entrada.nextFloat();
                System.out.print("Digite a taxa de juros: ");
                taxaC = entrada.nextFloat();
                System.out.print("Informe o período: ");
                periodoC = entrada.nextInt();

                valorFinalC = (float) (valorC * Math.pow(1 + (taxaC/100), periodoC));

                jurosFinalC = valorFinalC - valorC;

                System.out.println("\n O juros calculado é igual a " + jurosFinalC);
                System.out.println("O valor calculado é igual a " + valorFinalC);
            }else{
                System.out.print("\n A opção incorreta!");
                }
        }while(opcao != 3);         
    }
}
