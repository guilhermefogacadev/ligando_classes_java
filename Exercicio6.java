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
public class Exercicio6 {
    private static float nota;
    public static void main(String[] args) {
        System.out.print("Digite a nota: ");
        Scanner entrada= new Scanner(System.in);
        nota= entrada.nextFloat();
        while(nota<0  || nota>10){
            nota= entrada.nextFloat();
        }
        if(nota>=9.0){
            System.out.println("Seu conceito é A");
        }
        if(nota<9.0 && nota >7.0){
            System.out.println("Seu conceito é B");
        }
        if(nota<7.0 && nota >5.0){
            System.out.println("Seu conceito é C");
        }
        if(nota<5.0 && nota >=2.5){
            System.out.println("Seu conceito é D");
        }
        if(nota<2.5){
            System.out.println("Seu conceito é E");
        }
    }
}
