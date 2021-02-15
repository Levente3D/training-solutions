package exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Histogram {

    public List<String> createHistogram(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine())  != null){
        }
        return null;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("histogram.txt"))) {
            new Histogram().createHistogram(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
