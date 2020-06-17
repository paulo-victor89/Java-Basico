package pvictor.cursoemvideo.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        //Entrada de dados
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        //Formatando a nota com 2 casas decimais e pulando linha
        //System.out.printf("A nota é %.2f \n", nota);

        /*
          Colocando o nome e, formatando a nota com 2 casas decimais 
          e pulando linha.
          Pode ser utilizado o printf ou o format.
         */
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
    }

}
