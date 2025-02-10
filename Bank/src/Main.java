import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        double saldo;

    System.out.println("Por favor, insira o numero da conta:");
    numero = scanner.nextInt();

    //consome a quebra de linha
    scanner.nextLine();

    System.out.println("Por favor, insira o numero da agencia:");
    agencia = scanner.nextLine();
    System.out.println("Por favor, insira seu nome:");
    nome = scanner.nextLine();
    System.out.println("Por favor, insira o saldo:");
    saldo = scanner.nextDouble();


    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d e seu saldo %.2f ja esta disponivel para o saque", nome, agencia, numero, saldo);

    }

}