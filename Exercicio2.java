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

public class Exercicio2 {
    private static int idade;
    private static String nome;
    public static void main(String[] args) {
        System.out.print("Insira sua idade: ");
        Scanner entrada= new Scanner(System.in);
        idade= entrada.nextInt();
        System.out.print("Insira seu nome: ");
        nome= entrada.next();
        System.out.println("Sua idade: "+idade);
        System.out.println("Seu nome: "+nome);
    }
}
