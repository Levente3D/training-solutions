package classstructureattributes;

import java.util.Scanner;

public class ClientsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clients clients = new Clients();
        System.out.println("Kérem adja meg a nevét!");
        clients.cname = scanner.nextLine();
        System.out.println("Kérem adja meg a születési dátumát!");
        clients.birth = scanner.nextInt();
        clients.address = scanner.nextLine();
        System.out.println("Kérem adja meg a lakcímét!");
        clients.address = scanner.nextLine();
        System.out.println("Az ön neve: " + clients.cname);
        System.out.println("Az ön születési ideje: " + clients.birth);
        System.out.println("Az ön lakcíme: " + clients.address);

    }

}

