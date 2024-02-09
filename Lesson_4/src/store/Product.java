package store;

import java.util.Scanner;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

   public static Product findProduct(Product[] queueProduct){
       Scanner scanner = new Scanner(System.in);
       Product randomProduct = null;
       System.out.println("Введите название товара");
       String productName = scanner.nextLine();
           for (Product product : queueProduct) {
               if (productName.equalsIgnoreCase(product.getName())) {
                   randomProduct = product;
               }
           }
       return randomProduct;
   }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
