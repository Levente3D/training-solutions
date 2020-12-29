package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {

    @Test
    public void addProductTest(){
        Store store = new Store();

        assertFalse(store.addProduct(new Product("milk", 2020, 11,10)));
        assertTrue(store.addProduct(new Product("milk", 2020, 12, 8)));
        assertFalse(store.addProduct(new Product("milk", 2020, 12,26)));

    }

    @Test
    public void getNumberOfExpired(){

    }
}
