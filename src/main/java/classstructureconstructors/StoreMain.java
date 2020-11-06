package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store oneStore = new Store("one");
        oneStore.store(100);
        System.out.println(oneStore.getProducts() + " " + oneStore.getStock() + " darab");

        Store twoStore = new Store("two");
        twoStore.store(50);
        System.out.println(twoStore.getProducts() + " " + twoStore.getStock() + " darab");

        oneStore.dispatch(7);
        oneStore.store(13);
        twoStore.dispatch(16);
        twoStore.store(9);

        System.out.println(oneStore.getProducts() + " " + oneStore.getStock() + " darab");
        System.out.println(twoStore.getProducts() + " " + twoStore.getStock() + " darab");
    }
}
