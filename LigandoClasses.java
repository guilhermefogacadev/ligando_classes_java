/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.Scanner;
import projeto.Aluno;

/**
 *
 * @author guilh
 */
public class LigandoClasses {

    public static void main(String[] args) {
        String aux;
        Cliente cliente = new Cliente();
        Scanner entrada =new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        aux=entrada.next();
        cliente.setNome(aux);
        System.out.println("Digite o logradouro: ");
        aux=entrada.next();
        cliente.setLogradouro(aux);
        System.out.println("Digite o bairro: ");
        aux=entrada.next();
        cliente.setBairro(aux);
        System.out.println("Digite a cidade: ");
        aux=entrada.next();
        cliente.setCidade(aux);
        System.out.println("Digite o estado: ");
        aux=entrada.next();
        cliente.setEstado(aux);
        System.out.println("Digite o cep: ");
        aux=entrada.next();
        cliente.setCep(aux);
        System.out.println("Digite o telefone: ");
        aux=entrada.next();
        cliente.setTelefone(aux);
        System.out.println("Digite o rg: ");
        aux=entrada.next();
        cliente.setRg(aux);
        System.out.println("Digite o cpf: ");
        aux=entrada.next();
        cliente.setCpf(aux);
        
        System.out.println("Seu Nome:"+cliente.getNome());
        System.out.println("Seu Logradouro:"+cliente.getLogradouro());
        System.out.println("Seu Bairro:"+cliente.getBairro());
        System.out.println("Seu Cidade:"+cliente.getCidade());
        System.out.println("Seu Estado:"+cliente.getEstado());
        System.out.println("Seu CEP:"+cliente.getCep());
        System.out.println("Seu Telefone:"+cliente.getTelefone());
        System.out.println("Seu RG:"+cliente.getRg());
        System.out.println("Seu CPF:"+cliente.getCpf());
        
}

}
