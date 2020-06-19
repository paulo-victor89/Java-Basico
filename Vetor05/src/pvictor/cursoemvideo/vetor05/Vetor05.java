/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvictor.cursoemvideo.vetor05;

import java.util.Arrays;

/**
 *
 * @author victor
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[20];//quantidade de posições do vetor
        Arrays.fill(v,0);//preencdhimento do vetor somente com o valor 0
        for(int valor:v){
            System.out.print(valor + " ");// mostrando o vetor preencdhido
        }
    }
    
}
