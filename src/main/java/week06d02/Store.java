package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products;

    public Store(List<Product> products){
        this.products = new ArrayList<>(products);
    }

    public int getCategoryByName(Category categoryName){
        int count = 0;

        for(Product p: products){
            if(p.getCategory() == categoryName){
                count++;
            }
        }
        return count;
    }
}
