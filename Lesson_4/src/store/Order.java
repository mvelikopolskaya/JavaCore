package store;

import java.util.Arrays;
import java.util.Scanner;
import static store.Customer.findCustomer;
import static store.Product.findProduct;

public class Order {
    private Customer customer;
    private Product product;
    private int count;

    public Order(Customer customer, Product product, int count) {
        this.customer = customer;
        this.product = product;
        this.count = count;
    }

    public static Order buyProduct(Customer[] queueCustomer, Product[] queueProduct) {
        Scanner scanner = new Scanner(System.in);
        boolean isExist;
        Customer randomCustomer = findCustomer(queueCustomer);
        Product randomProduct = null;
        int randomCount = 0;
        if(!Arrays.asList(queueCustomer).contains(randomCustomer))
            throw new CustomerException("Данного покупателя нет в списке");
        do {
            try {
                isExist = true;
                randomProduct = findProduct(queueProduct);
                if(!Arrays.asList(queueProduct).contains(randomProduct))
                    throw new ProductException("Данного продукта нет в списке");
            } catch (ProductException e) {
                isExist = false;
                System.out.println("Данного продукта нет в списке");
            }
        } while(!isExist);
        System.out.println("Введите количество товара");
        int productCount = scanner.nextInt();
        try {
            if(productCount > 100 || productCount < 0) {
                randomCount = 1;
            } else randomCount = productCount;
        } catch (AmountException e) {
        }
        Order result = new Order(randomCustomer, randomProduct, randomCount);
        return result;
    }

    public static int orderCount (Order[] queueOrder){
        int count = (int) Arrays.stream(queueOrder).count();
        return count;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("customer=").append(customer);
        sb.append(", product=").append(product);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
