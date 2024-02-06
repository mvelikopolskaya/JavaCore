package company;

public class Manager extends Employee {
    public Manager(String firstName, String lastName, String middleName, String position, String phoneNumber, int salary, int dateOfBirth) {
        super(firstName, lastName, middleName, position, phoneNumber, salary, dateOfBirth);
    }

    public static void increaseSalaryToEveryoneExceptManager(CompanyList listOfEmployee){
        for (Employee employee : listOfEmployee) {
            if(employee instanceof Employee) {
                employee.setSalary(employee.getSalary() + 5000);
            }
        }
    }
}
