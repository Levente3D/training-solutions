package classstructureattributes;

import java.util.Scanner;

public class music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Kérem adja meg a kedvenc előadóját");
        song.band = scanner.nextLine();
        System.out.println("Kérem adja meg kedvenc számának a címét");
        song.title = scanner.nextLine();
        System.out.println("Kérem adja meg a szám hosszúságát");
        song.lenght = scanner.nextInt();

        System.out.println("Az Ön kedvenc zenéje: " + song.band + " - " + song.title + " (" + song.lenght +" perc)");

    }
}
