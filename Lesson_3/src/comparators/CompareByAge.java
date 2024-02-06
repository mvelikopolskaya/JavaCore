package comparators;

import company.Employee;
import java.util.Comparator;

public class CompareByAge implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }
}
