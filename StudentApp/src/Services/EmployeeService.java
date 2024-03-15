package Services;

import Domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> employees;
    public EmployeeService() {
        employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee employee = new Employee(name, age, "math");
        count++;
        employees.add(employee);
    }

//    @Override
//    public void print(List<Employee> group) {
//        for (Employee epml : group) {
//            System.out.println(epml);
//        }
//    }
}
