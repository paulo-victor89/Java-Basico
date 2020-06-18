/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author victor
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc < 10) {
            cc++;
            /*Enquanto contador for igual aos valores pedidos, ele não vai mostrar na tela esses valores. */
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;// altera o fluxo de um laço
            }
//            if (cc==7){
//                break;// sai do fluxo normal, mesmo sem terminar o laço.
//            }
            System.out.println("Cambalhota " + cc);
        }
    }

}
