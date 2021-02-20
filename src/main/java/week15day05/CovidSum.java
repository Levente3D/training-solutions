package week15day05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CovidSum {

    public List<CovidCasesPerCountry> count(BufferedReader reader) throws IOException{
        String line;
        reader.readLine();
        while ((line = reader.readLine())  != null) {
            System.out.println(line);

            if (line.contains("Bonaire, Saint Eustatius and Saba")){
                line = line.replace("Bonaire, Saint", "Bonaire Saint");
            }
                String[] parts = line.split(",");
            if (!parts[7].isBlank()){
                String country = parts[4];
                int population = Integer.parseInt(parts[7]);
                int number = Integer.parseInt(parts[2]);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("data.csv"))) {
            new CovidSum().count(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

}
