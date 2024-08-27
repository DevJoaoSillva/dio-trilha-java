public class Operadores {
    public static void main(String[] args) {

        //int numero = 5;
        //System.out.println( ++ numero);
        //System.out.println(numero);

        /*
        int a, b;

        a = 5;
        b = 6;
        String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);
        */ 

        /*
         * Operadores 
         * == igual
         * != diferente
         * > maior
         * >= maior ou igual
         * <= menor ou igual
         * < menor
         */

        //  String nomeUm = "JOAO";
        //  String nomeDois = new String("JOAO");

        //  System.out.println(nomeUm.equals(nomeDois));

        //  int numero1 = 1;
        //  int numero2 = 2;
        //  boolean simNao = numero1 == numero2;

        //  if(numero1 < numero2){
        //     System.out.println("a nossa condição é verdadeira");
        //  }

        //  System.out.println("numeroUm é igual a numeroDois? " + simNao);

        //  simNao = numero1 != numero2;

        //  System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        //  simNao = numero1 > numero2;
        //  System.out.println("numeroUm é maior que numeroDois? " + simNao);


        /*
         * Operados Lógicos
         * && = E
         * || = OU
         */

         boolean condicao1=true;
         boolean condicao2=true;

         if(condicao1 && condicao2){
            System.out.println("As duas condições sao verdadeiras!!!");
         }

         if(condicao1 || condicao2){
            System.out.println("Uma duas condições sao verdadeiras!!!");
         }

         
         if(condicao1 && (7 > 4)){
            System.out.println("As duas condições sao verdadeiras!!!");
         }
         
         System.out.println("FIM");
        
    }
}
