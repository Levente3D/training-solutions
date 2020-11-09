package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a befektetés összegét:");
        int amount = scanner.nextInt();
        System.out.println("Kérem adja meg a kamatlábat (egész számmal):");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(amount, interestRate);

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam 50 napra: " + investment.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + investment.close(80));
        System.out.println("Kivett összeg 90 nap után: " + investment.close(90));
    }
}
