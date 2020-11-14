package introcontrol;

import java.util.Scanner;

 public class QualifierMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy számot:");
        int number = scanner.nextInt();
        if (number <= 100) {
            System.out.println("100 vagy kevesebb");
        } else {
            System.out.println("Nagyobb, mint 100.");
        }
    }
}
