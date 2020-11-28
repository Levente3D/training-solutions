package week05d03;

import java.util.List;

public class ListCounter {

    public int Counter(List<String> words){
        int x = 0;
        for (String item : words){
            if (item.toUpperCase().startsWith("A"));{
                x++;
            }
        }
        return x;
    }
}
