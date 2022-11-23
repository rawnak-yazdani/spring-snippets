package io.welldev.dataclass;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GreetingService {
    List<Greeting> employeeList = new ArrayList<>(Arrays.asList(
            new Greeting(1, "Peter Parker"),
            new Greeting(2, "Bruce Wayne")
    ));

    public List<Greeting> getEmployees() {
        return employeeList;
    }

    public Greeting getEmployee(Long id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                return employeeList.get(i);
            }
        }
        return employeeList.get(0);
    }

    public void addEmployee(Greeting employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(Long id, Greeting employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.set(i, employee);
                break;
            }
        }
//        employeeList.
    }

    public void deleteEmployee(Long id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(employeeList.get(i));
                break;
            }
        }
    }
}
