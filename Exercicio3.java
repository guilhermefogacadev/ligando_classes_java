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
public class Exercicio3 {
    private static int numero1;
    private static int numero2;
    private static int numero3;
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner entrada= new Scanner(System.in);
        numero1= entrada.nextInt();
        System.out.print("Digite um numero: ");
        numero2= entrada.nextInt();
        System.out.print("Digite um numero: ");
        numero3= entrada.nextInt();
        System.out.println("A soma dos 3 numeros: "+(numero1+numero2+numero3));
        
    }
}
