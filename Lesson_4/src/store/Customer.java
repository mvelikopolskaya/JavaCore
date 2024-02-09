package store;

import java.util.Scanner;

public class Customer {
    private String name;
    private int age;
    private String phoneNumber;
    Gender gender;

    public Customer(String name, int age, String phoneNumber, Gender gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender.toString();
    }

    public static Customer findCustomer(Customer[] queueCustomer){
        Scanner scanner = new Scanner(System.in);
        Customer randomCustomer = null;
        System.out.println("Введите имя покупателя");
        String customerName = scanner.nextLine();
            for (Customer customer : queueCustomer){
                if(customerName.equalsIgnoreCase(customer.getName())){
                    randomCustomer = customer;
                }
            }
        return randomCustomer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", gender=").append(getGender());
        sb.append('}');
        return sb.toString();
    }
}
