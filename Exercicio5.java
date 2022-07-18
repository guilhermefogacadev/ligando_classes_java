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
public class Exercicio5 {

    private static String nome;

    public static void main(String[] args) {
        System.out.print("Digite seu nome: ");
        Scanner entrada = new Scanner(System.in);
        nome = entrada.nextLine();
        System.out.println("============================================\n"
                + "\n"
                + "UTFPR – Universidade Tecnológica Federal do Paraná\n"
                + "\n"
                + "Disciplina Programação Orientada a Objetos\n"
                + "\n"
                + "Nome:"+nome+"\n"
                + "\n"
                + "============================================");
    }
}
