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
public class Tabuada {
    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\t\t\t -- Tabuada --\n");
        System.out.print("Informe um número: ");
        n = entrada.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
