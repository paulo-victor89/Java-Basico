/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvictor.cursoemvide.programaidade;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class ProgramaIdadeCondicionalComposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano voce nasceu? ");
      int nascimento = teclado.nextInt();
      int idade = 2020 - nascimento;
        System.out.println("Você tem: " + idade + " anos");
      if(idade>=18){
          System.out.println("Porntanto é maior de idade");
      }else{
          System.out.println("Até o momento é menor de idade");
      }
      
    }
    
}
