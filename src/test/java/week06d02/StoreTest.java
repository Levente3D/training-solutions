package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void getProductsByNameTest(){
        Store store = new Store(Arrays.asList(
                new Product("Kifli", Category.BAKEDGOODS,28),
                new Product("Zsemle",Category.BAKEDGOODS,25),
                new Product("Tej",Category.DAIRY,199),
                new Product("Joghurt",Category.DAIRY,150),
                new Product("Kasza",Category.HOUSEKEEPING,6000 ),
        ))

                assertEquals(2, store.getCategoryByName(Category.BAKEDGOODS));
                assertEquals(2, store.getCategoryByName(Category.HOUSEKEEPING));
    }
}
