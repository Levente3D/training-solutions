package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int boat1 = 5;
        int boat2 = 3;
        int boat3 = 2;
        int boatPlace = 10;
        int boatNr = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("A csoport létszáma?");
        int team = scanner.nextInt();

        if (team >= 5) {
            System.out.println("Az 5 személyes csónak kiment.");
            boatPlace = boatPlace - 5;
            boatNr--;
            team = team - 5;
        }
        if (team >= 3) {
            System.out.println("A 3 személyes csónak kiment.");
            boatPlace = boatPlace - 3;
            boatNr--;
            team = team - 3;
        }
        if (team >= 1) {
            System.out.println("A 2 személyes csónak kiment.");
            boatPlace = boatPlace - 2;
            boatNr--;
            team = team - 2;
        }
        if (team > 0) {
            System.out.println("Nem fért el mindenki a csónakban.");
        } else {
            System.out.println("A szabad helyek száma: " + boatPlace + ", a szabad csónak száma: " + boatNr);
        }
    }
}
