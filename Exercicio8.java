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
public class Exercicio8 {
    private static int numero;
    private static int soma;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nuemero:");
        numero = entrada.nextInt();
        for (int i = 1; i <=numero; i++) {
            soma+=i;
            
        }  
        System.out.println("Soma="+soma);
    }

}
