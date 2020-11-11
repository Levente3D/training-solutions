package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy felhasználónevet:");
        String username = scanner.nextLine();

        System.out.println("Adjon meg egy jelszót:");
        String password = scanner.nextLine();

        System.out.println("Adja meg még egyszer a jelszót:");
        String password2 = scanner.nextLine();

        System.out.println("Adjon meg egy email címet:");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUsername(username) ? "felhasználónév rendben" : "felhasználónév helytelen");
        System.out.println(userValidator.isValidPassword(password, password2) ? "jelszó rendben" : "jelszó helytelen");
        System.out.println(userValidator.isValidEmail(email) ? "e-mail rendben" : "e-mail helytelen");
    }
}
