package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] napok = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        System.out.println(napok[1]);
        System.out.println(napok.length);

        int[] hatvanyNr = new int[5];
        hatvanyNr[0] = 1;
        for (int x = 1; x < hatvanyNr.length; x++){
            hatvanyNr[x] = hatvanyNr[x - 1] * 2;
        }
        for (int x = 0; x < hatvanyNr.length; x++){
            System.out.println(hatvanyNr[x] + "");
        }

        boolean[] arrayNr = new boolean[6];
        for (int x = 1; x < arrayNr.length; x++) {
            arrayNr[x] = !arrayNr[x - 1];
        }
        for (int x = 0; x < arrayNr.length; x++){
            System.out.println(arrayNr[x] + "");
        }

    }

}
