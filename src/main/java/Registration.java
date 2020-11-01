package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Kérem adjon meg egy felhasználó nevet");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Kérem adjon meg még egy email címet");
        String mail = scanner.nextLine();

        System.out.println("Ön a " + name + "felhasználói névvel és " + mail + "email címmel regisztrált!");
    }
}
