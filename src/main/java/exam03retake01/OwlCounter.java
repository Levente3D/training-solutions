package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    public void readFromFile(BufferedReader reader) throws IOException {
            String line;
            while ((line = reader.readLine())  != null) {
                    System.out.println(line);
            }
            return line;
            System.out.println(line);

    }

    Map<Character, Integer> countOfOwl = new HashMap<>();
        for (char c: s.toCharArray()) {
                if (countOfOwl.containsKey(c)) {
                        countOfOwl.put(c, countOfOwl.get(c) + 1);
                }
                else {
                        countOfOwl.put(c, 1);
                }
        }

    public int getNumberOfOwls(String s) {
    }
}
