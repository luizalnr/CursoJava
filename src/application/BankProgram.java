package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class BankProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account account;

        // Número da conta
        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        
        // Nome do titular da conta
        System.out.print("Enter account holder: ");
        String holder = scanner.nextLine();
        
        // Pergunta sobre depósito inicial
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scanner.next().toLowerCase().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
        	account = new Account(number, holder);
        }
        
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        account.deposit(depositValue);
        
        System.out.println();
        System.out.println("Update account data: ");
        System.out.println(account);
        
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        account.deposit(withdrawValue);
        
        
        
        scanner.close();
    }

    
}
