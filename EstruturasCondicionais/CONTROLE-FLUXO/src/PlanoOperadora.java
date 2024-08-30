import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Plano de Operadora");
        System.out.println("--------------------------");
        System.out.println("Menu de Opções");
        System.out.println("Opção 1 : Plano BASIC");
        System.out.println("Opção 2 : Plano MIDIA");
        System.out.println("Opção 3 : Plano Turbo");
        System.out.println("--------------------------");
        System.out.print("Informe a opção desejada(1/2/3): ");
        String opcao = scan.nextLine();

        switch (opcao) {
            case "1":
                System.out.println("Plano Basic - 100 min de ligação");
                break;
            case "2":
                System.out.println("Plano Midia - 100 min de ligação + Whats + Instagram grátis");
                break;
            case "3":
                System.out.println("Plano Turbo : 100 min de ligação + Whats + 5Gb de Youtube");
            default:
                System.out.println("Opção Inválida!!!");
        }

    }
}
