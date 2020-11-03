package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Kérem adja meg a nevét!");
        client.cname = scanner.nextLine();
        System.out.println("Kérem adja meg a születési dátumát!");
        client.birth = scanner.nextInt();
        client.address = scanner.nextLine();
        System.out.println("Kérem adja meg a lakcímét!");
        client.address = scanner.nextLine();
        System.out.println("Az ön neve: " + client.cname);
        System.out.println("Az ön születési ideje: " + client.birth);
        System.out.println("Az ön lakcíme: " + client.address);

    }

}

