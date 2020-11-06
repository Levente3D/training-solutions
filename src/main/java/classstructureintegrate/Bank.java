package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számla számát");
        String accountNumber = scanner.nextLine();

        System.out.println("A számlatulajdonos neve:");
        String owner = scanner.nextLine();

        System.out.println("Összeg");
        int amount = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber,owner,amount);

        System.out.println("Kérem a második számla számát");
        String accountNumber2 = scanner.nextLine();

        System.out.println("A számlatulajdonos neve:");
        String owner2 = scanner.nextLine();

        System.out.println("Összeg");
        int amount2 = scanner.nextInt();

        BankAccount account2 = new BankAccount(accountNumber2,owner2,amount2);

        System.out.println(account1.getInfo());
        System.out.println();
        System.out.println(account2.getInfo());

        System.out.println("Befizetés összege az első számlára:");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);
        System.out.println("Kifizetés összege az első számláról:");
        int withdrawAmount = scanner.nextInt();
        account1.withdraw(withdrawAmount);

        System.out.println(account1.getInfo());

        System.out.println("Befizetés összege az második számlára:");
        int depositAmount2 = scanner.nextInt();
        account2.deposit(depositAmount2);
        System.out.println("Kifizetés összege a második számláról:");
        int withdrawAmount2 = scanner.nextInt();
        account2.withdraw(withdrawAmount2);

        System.out.println(account2.getInfo());

        System.out.println();
        System.out.println("Átutalás összege az első számláról a másodikra:");
        int transferAmount =scanner.nextInt();
        account1.transfer(account2, transferAmount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());




    }



}
