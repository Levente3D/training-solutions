package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalatonStorm {

    private Map<String, Integer> stationList = new HashMap<>();

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        String line;
        String line;
        while ((line = reader.readLine()) != null){
            String[] parts = line.split(":");
            if (line.contains("allomas")) {
                String destination = parts[2];{
                    if (line.contains("level")){
                        String[] parts = line.split(":");
                        Integer level = Integer.parseInt(parts[2]);
                        stationList.put(destination, level);
                    }
                  System.out.println(stationList);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(stationList.values());
    }
}
