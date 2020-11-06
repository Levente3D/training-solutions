package classstructureconstructors;

public class Store {
    private String products;
    private int stock;

    public Store(String products){
        this.products = products;
        stock = 0;
    }

    public String getProducts() {
        return products;
    }

    public int getStock() {
        return stock;
    }

    public void store(int amount){
        stock = stock + amount;
    }
    public void dispatch(int amount){
        stock = stock - amount;
    }
}
