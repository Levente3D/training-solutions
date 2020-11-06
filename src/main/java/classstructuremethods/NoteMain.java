package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Az Ön neve: ");
        String name = scanner.nextLine();
        note.setName(name);

        System.out.println("A jegyzet témája: ");
        String topic = scanner.nextLine();
        note.setTopic(topic);

        System.out.println("A szöveg: ");
        String text = scanner.nextLine();
        note.setText (text);

        System.out.println(note.getNoteText());
    }
}
