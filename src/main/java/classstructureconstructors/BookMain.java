package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Bernard Cornwell","Az üres trón");
        book.register("547");

        System.out.println("Szerző: " + book.getAuthor());
        System.out.println("A könyv címe: : " + book.getTitle());
        System.out.println("Regisztrációsszám: " + book.getRegnumber());

    }
}
