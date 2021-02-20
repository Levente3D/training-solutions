package week11day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

    public int readFile(String name){
        // Path path = Path.of(name);
        try {
            String fileContent = Files.readString(Path.of(name));
            int number = Integer.parseInt(fileContent);
            return number;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public int sumNumbers(){
        int sum = 0;
        for (int i = 0; i < 100; i++){
//            1. verzió
//            String filename = "number" + (i < 10 ? "0" + i : i) + ".txt";
//            System.out.println(filename);
//            2. verzió
//            String filename;
//            if (i < 10){
//                filename = "number" + i + ".txt";
//            }
//            else{
//                filename = "number" +i + ".txt";
//            }
//            3. verzió
              String filename = String.format("number%02d.txt", i);
            System.out.println(filename);

            if (Files.isRegularFile(Path.of(filename))){
                int number = readFile(filename);
                sum += number;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(new FileSum().readFile("number20.txt"));
        System.out.println(new FileSum().sumNumbers());
    }
}
