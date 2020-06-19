/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvictor.cursoemvideo.vetor01;

import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 2, 8, 7, 5, 4};
         System.out.println("Total de casas de N = " + n.length);
        for (int c = 0; c <= n.length-1; c++) {
            System.out.println("Na posicao " + c + " temos o valor  " + n[c]);
            //JOptionPane.showMessageDialog(null, n[c]);
//            JOptionPane.showMessageDialog(null, "<html>"
//                    + "<br>Vetor <br> <hr>"
//                    + "<br>Na posicao "+ c + "o valor e" + n[c] + "<br>"
//                    + "Na posicao " + c + "o valor e" + n[c]+ "<br>"
//                    + "Na posicao " + c + "o valor e" + n[c]+ "<br>"
//                    + "Na posicao " + c + "o valor e" + n[c]+ "<br>"
//                    + "Na posicao " + c + "o valor e" + n[c]+ "<br>"
//                    + "Na posicao " + c + "o valor e" + n[c]+ "<br>"
//                    + "</html>");

        }

    }

}
