/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvictor.cursoemvideo.vetor03comforeach;

import java.util.Arrays;

/**
 *
 * @author victor
 */
public class Vetor03ComForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double v[] = {3.5, 2.75, 9, -4.5};
       Arrays.sort(v);//colocar o vetor em ordem
       for (double valor: v){
           System.out.println(valor + " " );
       }
    }
    
}
