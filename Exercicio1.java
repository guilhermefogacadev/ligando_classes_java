/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.Scanner;

/**
 *
 * @author guilh
 */

public class Exercicio1 {
    private static int numero;
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner   entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        System.out.println("Numero antecessor "+(numero-1));
        System.out.println("Numero sucessor "+(numero+1));
        
    }
}
