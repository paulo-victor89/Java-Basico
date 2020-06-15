/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author victor
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Mostrando a media entre 2 numeros
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A media entre os valores é: " + m);       
         */

        /*  Operadore Unários
        
            ++ incremento  a ++ a = a + 1
            -- decremento  a -- a = a -1
            numero ++ pos-incremento
            ++numero pre-incremento
        //exemplos abaixo
        int numero = 10;
        int valor = 4 + numero--;
        System.out.println("Soma numero + valor  " + valor);
        System.out.println("Faz o incremento ou decremento do numero  " + numero);
         */
        
        /*  Operadore de atribuição
        
            += somar e atribuir  a+=b -> a = a + b
            -= subtrair e atribuir  a-=b -> a = a - b
            *= multiplicar e atribuir  a*=b -> a = a * b
            += dividir e atribuir  a/=b -> a = a / b
            += resto e atribuir  a%=b -> a = a % b
        // exemplos abaixo 
        int mult = 4, sub = 4, div = 4, soma = 4, resto = 4;
        soma +=2; // x = x + 2
        System.out.println("O valor 4 recebeu 4 + 2 = " + soma);
        sub -=2; // x = x - 2
        System.out.println("O valor 4 recebeu 4 - 2 = " + sub);
        mult *=2; // x = x * 2
        System.out.println("O valor 4 recebeu 4 * 2 =  " + mult);
        div /=2; // x = x / 2
        System.out.println("O valor 4 recebeu 4 / 2 = " + div);
        */
        
        /* Arredondamento de numeros 
        
        float v = 8.5f;
        int aredondadoBaixo = (int) Math.floor(v);
        System.out.println("O valor de v arendodado para baixo e: "+ aredondadoBaixo);
        int aredondadoCima = (int) Math.ceil(v);
        System.out.println("O valor de v arredondado para cima e: "+ aredondadoCima);
        int aredondadoAritmetico = (int) Math.round(v);
        System.out.println("O valor de v arredondado aritmeticamente e: "+ aredondadoAritmetico);
        
            //No round se numero > .5 aredonda para cima
            //Se numero < .5 arredonda para baixo
        */
        /* Numero randomico    
            random() numero entre 0.0 e 1.0 
            Escolhendo o intervalo de 5 ate 10
            5 + Math.random() * (10-5)
            para qualquer intevalo desejado basta trocas os valores.
        */
        
        double aleatorio = Math.random();
        int intervalo = (int)(5 + aleatorio * (10-5));
        System.out.println("Valor gerado aleatoriamente ente 0 e 1: "+ aleatorio);
        System.out.println("Valor gerado aleatoriamente entre 5 e 10: "+ intervalo);
    }

}
