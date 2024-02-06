import CompanyUtils.EmployeeUtils;
import company.CompanyList;
import company.Employee;
import company.Manager;

//Класс CompanyList создан для вывода списка сотрудников в терминал, обычнй ToString не работал корректно.
//Компараторы вынесены в отдельные классы для удобства обращения и возможности сравнивать по нескольким параметрам.

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Smirnova", "Anna", "Vladimirovna", "Java developer", "+123", 100000, 1979);
        Employee employee2 = new Employee("Petrova", "Marina", "Andreevna", "Accountant", "+456", 100000, 1975);
        Employee employee3 = new Employee("Sergeev", "Ivan", "Konstantinovich", "Designer", "+789", 80000, 1997);
        Employee employee4 = new Employee("Borisova", "Elena", "Alexandrovna", "Java developer", "+012", 90000, 1992);
        Employee employee5 = new Employee("Gorelov", "Sergey", "Ivanovich", "Janitor", "+345", 50000, 2000);
        Employee employee6 = new Manager("Svetlova", "Margarita", "Borisovna", "Manager", "+678", 150000, 1972);
        CompanyList companyList = new CompanyList();
        companyList.addEmployee(employee1);
        companyList.addEmployee(employee2);
        companyList.addEmployee(employee3);
        companyList.addEmployee(employee4);
        companyList.addEmployee(employee5);
        companyList.addEmployee(employee6);
        System.out.println(companyList);
        EmployeeUtils.increaseSalaryToEveryoneOlderThenFortyFive(companyList);
        System.out.println(companyList);
        companyList.compareBySalary();
        System.out.println(companyList);
        companyList.compareByLastname();
        System.out.println(companyList);
        companyList.compareByAge();
        System.out.println(companyList);
        System.out.println(companyList);
        Manager.increaseSalaryToEveryoneExceptManager(companyList);
        System.out.println(companyList);
    }
}