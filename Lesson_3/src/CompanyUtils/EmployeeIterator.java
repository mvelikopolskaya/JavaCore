package CompanyUtils;

import java.util.Iterator;
import java.util.List;

public class EmployeeIterator<Employee> implements Iterator<Employee> {
    private int index;
    private List<Employee> companyList;

    public EmployeeIterator(List<Employee> companyList) {
        this.companyList = companyList;
    }

    @Override
        public boolean hasNext() {
            return companyList.size() > index;
        }

    @Override
    public Employee next() {
        return companyList.get(index++);
    }
}
