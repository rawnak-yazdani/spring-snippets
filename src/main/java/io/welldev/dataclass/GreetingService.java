package io.welldev.dataclass;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GreetingService {
    List<Greeting> employeeList= Arrays.asList(
            new Greeting(1,"Peter Parker"),
            new Greeting(2,"Bruce Wayne")
    );

    public List<Greeting> getEmployees(){
        return employeeList;
    }
}
