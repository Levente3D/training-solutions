package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Kérem adjon meg egy számot");
        Scanner scanner = new Scanner (System.in);
        int elsoszam = scanner.nextInt();
        System.out.println("Kérem adjon meg még egy számot");
        int masodikszam = scanner.nextInt();

        System.out.println(elsoszam + " + " +  masodikszam);
        System.out.println(elsoszam + masodikszam);
    }
}
