import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Seja Bem Vindo à Nossa Agência");

       System.out.print("Por favor, digite o número da Agência: ");
       String agencia = scanner.nextLine();

       System.out.print("Por favor, digite o número da Conta: ");
       int numero = scanner.nextInt();
       scanner.nextLine(); //realiza a quebra de linha

       System.out.print("Por favor, digite seu nome: ");
       String nomeCliente = scanner.nextLine();

       System.out.print("Por favor, digite o saldo: ");
       String saldo = scanner.nextLine();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo de R$ "+ saldo + " já está disponível para saque.");

        scanner.close();

    }
}
