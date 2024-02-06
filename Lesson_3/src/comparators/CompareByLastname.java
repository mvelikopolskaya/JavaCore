package comparators;

import company.Employee;
import java.util.Comparator;

public class CompareByLastname implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getLastName().compareTo(e2.getLastName());
    }
}
