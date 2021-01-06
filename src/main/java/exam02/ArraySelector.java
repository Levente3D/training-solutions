package exam02;

import java.lang.reflect.Array;

public class ArraySelector {

    public int getSelectEvens(Array[] parts){
        StringBuilder result = new StringBuilder();

        if (parts == null){
            throw new IllegalArgumentException("Üres lista!");
        }
        if (parts.lenght() !=0){
            result.append("[");
            for(int i =0; i < parts.length(); i+=2){
                result.append(parts.get[i]);
            }
            result.append("]");
        }
        return result.toString();
    }
}
