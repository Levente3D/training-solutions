package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class StoreTest {

    @Test
    public void addProductTest(){
        Store store = new Store();

        assertFalse(store.addProduct(new Product("milk", 2020 22)));
        assertTrue(store.addProduct(new Product("milk", 2020 11) 25);
        assertFalse(store.addProduct(new Product("milk", 2020 22)));

    }

    @Test
    public void getNumber(){

    }
}
