public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        if(nota >= 7)
            System.out.println("Aprovado");
        else if(nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação");
        else
            System.out.println("Reprovado");

        System.out.println(resultado);

        int nota1 = 6;

        String resultado1 = nota1>=7 ? "Aprovado" : nota1 >= 5 && nota1 < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
