package week11day03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c){
        List<String> filterList = new ArrayList<>();
        String s = String.valueOf(c);
        for (String item: words){
            if (item.contains(s)){
                filterList.add(item);
            }
        }
        return filterList;
    }
}
