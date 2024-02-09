import store.Customer;
import store.Order;
import store.Gender;
import store.Product;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Anna", 35, "+123", Gender.FEMALE);
        Customer customer2 = new Customer("Vlad", 31, "+456", Gender.MALE);
        Customer[] customerQueue = new Customer[]{customer1, customer2};
        Product product1 = new Product("Coffee", 100);
        Product product2 = new Product("Tea", 100);
        Product product3 = new Product("Roll", 50);
        Product product4 = new Product("Sandwich", 150);
        Product product5 = new Product("Chocolate", 70);
        Product[] productQueue = new Product[]{product1, product2, product3, product4, product5};
        Order[] orderQueue = new Order[5];
        Order order1 = Order.buyProduct(customerQueue, productQueue);
        Order order2 = Order.buyProduct(customerQueue, productQueue);
        Order order3 = Order.buyProduct(customerQueue, productQueue);
        Order order4 = Order.buyProduct(customerQueue, productQueue);
        Order order5 = Order.buyProduct(customerQueue, productQueue);
        orderQueue[0] = order1;
        orderQueue[1] = order2;
        orderQueue[2] = order3;
        orderQueue[3] = order4;
        orderQueue[4] = order5;
        System.out.println(Order.orderCount(orderQueue));
        Order.saveOrderQueue(orderQueue, "src/");
    }
}