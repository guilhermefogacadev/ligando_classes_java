
package projeto;

import java.util.Scanner;


public class Exercicio4 {

    private static double valor;
    private static double gorgeta=0.10;
    public static void main(String[] args) {
        System.out.print("Insira o valor gasto: ");
        Scanner entrada= new Scanner(System.in);
        valor= entrada.nextDouble();
        gorgeta=valor*gorgeta;
        valor=valor+gorgeta;
        System.out.println("Valor gasto: "+valor);
    }
    
}
