package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x ==1){
            System.out.println("Felhasználók listázása");
        }
        if (x == 2){
            System.out.println("Felhasználó felvétele");
        }
        if (x > 2){
            System.out.println("Kérem válasszon másik menűpontot");
        }
    }
}
