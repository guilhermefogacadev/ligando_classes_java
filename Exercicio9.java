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
public class Exercicio9 {

    private static int numero=1;
    public static int mult(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + numero * i+"\n");
        }
        return numero++;
    }

    public static void main(String[] args) {
      
        while (numero <= 10) {
            mult(numero);
            numero++;
        }

    }
}
