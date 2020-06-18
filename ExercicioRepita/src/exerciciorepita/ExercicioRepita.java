/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;


/**
 *
 * @author victor
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, media,  soma = 0;
        int total = 0;//total de valores digitados
        int par = 0; // numeros pares
        int impar = 0;//total de impares
        int acimaDeCem = 0;// numeros acima de 100
        
        do{
           numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um numero: <br><em>(valor 0 interrompe o programa)</em></html>"));
           soma += numero;
           if(numero % 2 == 0){
               par++;
           }else{
               impar++;
           }
           if(numero > 100){
               acimaDeCem++;
           }
           if(numero !=0)
               total++;
               
        }while(numero != 0 );
        media = soma / total;
       JOptionPane.showMessageDialog(null,
               "<html>"
               + "<hr>Resultado <hr>"
               +"<br>Total do valores digitados: "+total +"<br>"
               +"Total dos numeros pares: "+par +"<br>"
               +"Total dos numeros impares: "+ impar+"<br>"
               +"Numeros acima de 100: "+acimaDeCem+"<br>"
               +"Média dos valores: "+media+ "<br>"
               +"</html>");        
               
       
    }
    
}
