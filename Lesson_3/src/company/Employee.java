package company;

import java.time.Year;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private String position;
    private String phoneNumber;
    private int salary;
    private int dateOfBirth;

    public Employee(String lastName, String firstName, String middleName, String position, String phoneNumber, int salary, int dateOfBirth) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return Year.now().getValue() - dateOfBirth;
    }

    public void setAge(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Last name: ");
        stringBuilder.append(getLastName());
        stringBuilder.append("\n");
        stringBuilder.append("First name: ");
        stringBuilder.append(getFirstName());
        stringBuilder.append("\n");
        stringBuilder.append("Middle name: ");
        stringBuilder.append(getMiddleName());
        stringBuilder.append("\n");
        stringBuilder.append("Position: ");
        stringBuilder.append(getPosition());
        stringBuilder.append("\n");
        stringBuilder.append("Salary: ");
        stringBuilder.append(getSalary());
        stringBuilder.append("\n");
        stringBuilder.append("Phone number:");
        stringBuilder.append(getPhoneNumber());
        stringBuilder.append("\n");
        stringBuilder.append("Age:");
        stringBuilder.append(getAge());
        return stringBuilder.toString();
    }
}
