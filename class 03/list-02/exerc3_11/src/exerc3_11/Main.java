package exerc3_11;

import java.util.Scanner;

import entities.Account;

public class Main {
    public static void main(String[] args) {
        // Criação de objeto Scanner para entrada de dados do usuário
        Scanner input = new Scanner(System.in);

// Criação de duas contas bancárias com saldos iniciais
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

// Imprime os saldos iniciais das contas bancárias
        System.out.printf("%s balance: $%.2f %n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

// Recebe um valor de depósito para a conta 1 e adiciona ao saldo
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

// Imprime os saldos das contas bancárias após o depósito
        System.out.printf("%s balance: $%.2f %n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

// Recebe um valor de depósito para a conta 2 e adiciona ao saldo
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

// Imprime os saldos das contas bancárias após o segundo depósito
        System.out.printf("%s balance: $%.2f %n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

// Recebe um valor de saque para a conta 1 e retira do saldo
        System.out.print("Enter a value to be removed from account1: ");
        double removedValue = input.nextDouble();
        account1.withDraw(removedValue);

// Recebe um valor de saque para a conta 2 e retira do saldo
        System.out.println();
        System.out.print("Enter a value to be removed from account2: ");
        removedValue = input.nextDouble();
        account2.withDraw(removedValue);

// Fecha o objeto Scanner
        input.close();
    }
}

