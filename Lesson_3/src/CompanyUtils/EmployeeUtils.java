package CompanyUtils;

import company.CompanyList;
import company.Employee;

import java.util.Collections;

public class EmployeeUtils {
    public CompanyList companyList;

    public EmployeeUtils() {
        companyList = new CompanyList();
    }

    public void compareBySalary() {

    }
    public static void increaseSalaryToEveryoneOlderThenFortyFive(CompanyList listOfEmployee){
        for (Employee employee : listOfEmployee) {
            if(employee.getAge() > 45) {
                employee.setSalary(employee.getSalary() + 5000);
            }
        }
    }
}
