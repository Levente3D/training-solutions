package classstructureintegrate;

import java.util.Scanner;

public class ProductsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A termék neve:");
        String name = scanner.nextLine();

        System.out.println("A termék ára:");
        int price = scanner.nextInt();

        Products products = new Products(name, price);
        System.out.println(products.getName() + " " + products.getPrice());

        products.increasePrice(10);
        System.out.println(products.getName() + " " + products.getPrice());

        products.decreasePrice(3);
        System.out.println(products.getName() + " " + products.getPrice());
    }
}
