package company;

import CompanyUtils.EmployeeIterator;
import comparators.CompareByAge;
import comparators.CompareByLastname;
import comparators.CompareBySalary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CompanyList implements Iterable<Employee>{
    List<Employee> companyList;

    public CompanyList() {
        companyList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        companyList.add(employee);
    }

    public void compareBySalary() {
        companyList.sort(new CompareBySalary());
    }

    public void compareByAge() {
        companyList.sort(new CompareByAge());
    }

    public void compareByLastname() {
        companyList.sort(new CompareByLastname());
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator<>(companyList);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee: companyList) {
            stringBuilder.append(employee);
            stringBuilder.append("\n");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
