package comparators;

import company.Employee;
import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary() - e2.getSalary();
    }
}
