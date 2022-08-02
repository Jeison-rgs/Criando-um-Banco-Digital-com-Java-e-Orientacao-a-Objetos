import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        double saldo = 0;        
        while (true) {
            imprimeMenu();
            option = sc.nextInt();
            if (option == 0) {
                break;
            }
            if (option == 1) {
                //3.1 imprimir saldo
                System.out.println(" Seu saldo é: $" + saldo);
            } else if (option == 2) {
                // 3.2 realizar saque
                System.out.println(" Informe um valor para saque: ");
                double saque = sc.nextDouble();
                if (saque <= 0) {
                    System.out.println(" O valor é inválido. ");
                } else if (saque > saldo) {
                    System.out.println(" Saldo insuficiente. ");
                } else {
                    System.out.println("$" + saque + " Sacado com sucesso. ");
                    saldo -= saque;
                }
            } else if (option == 3) {
                // 3.3 realizar deposito
                System.out.println(" Informe um valor para depósito: ");
                double deposito = sc.nextDouble();
                if (deposito <= 0) {
                    System.out.println(" O valor é inválido. ");
                } else {
                    System.out.println("$" + deposito + " Depositado com sucesso. ");
                    saldo += deposito;
                }
            } else {
                System.out.println(" Opção inválida, tente novamente. ");
            }
        }
        System.out.println(" Obrigado por escolher o banco FAT! ");
    }
    public static void imprimeLinha() {
        System.out.println(" ********** ");
    }
    public static void imprimeMenu() {
        imprimeLinha();
        System.out.println(" 1) Saldo: ");
        System.out.println(" 2) Saque: ");
        System.out.println(" 3) Depósito: ");
        System.out.println(" 0) SAIR. ");
        imprimeLinha();
    }
}
