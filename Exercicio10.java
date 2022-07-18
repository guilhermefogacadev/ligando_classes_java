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
public class Exercicio10 {
    private static int numero1;
    private static int numero2;
    private static int menor;
    private static int maior;
    private static int soma;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nuemero:");
        numero1 = entrada.nextInt();
        System.out.println("Digite um nuemero:");
        numero2 = entrada.nextInt();
        if(numero1>numero2){
            maior=numero1;
            menor=numero2;
        }else{
            maior=numero2;
            menor=numero1;
        }
        for (int i=menor; i <=maior; i++) {
            soma+=i;
        }
        System.out.println("Soma: "+soma);
    }
}
