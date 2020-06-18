/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int numero, soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um numero:");
            numero = teclado.nextInt();
            soma+= numero;
            System.out.print("Quer continuar ? [Sim/Não] ");
            resposta = teclado.next();
        }while(resposta.equals("Sim"));
        System.out.println("A soma dos valores digitados e: " + soma);
    }
    
}
