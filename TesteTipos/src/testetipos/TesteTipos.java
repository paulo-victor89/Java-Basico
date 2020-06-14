package testetipos;

/**
 *
 * @author victor
 */
public class TesteTipos {

    public static void main(String[] args) {
        /* Convertendo int para string 
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
         */
        
        /*Convertendo string para int  
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        */
        
        /*Convertendo string para float  */
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.format("%.3f \n",idade);
    }

}
