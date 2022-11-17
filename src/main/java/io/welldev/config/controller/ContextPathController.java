package io.welldev.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContextPathController {
    /**
     * Scope of ModelAndView is current request
     */
    @GetMapping("/")
    public ModelAndView hello() {

//        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(WebMvcConfig.class);

        /**
         * Object is created by the spring container and inversion of control is occurring (not DI)
         */
//        StudentDaoImpl studentDaoImpl = (StudentDaoImpl) springContainer.getBean(StudentDaoImpl.class);
/**/
//        System.out.println("------Records Creation--------");
//        studentDaoImpl.insert("Zara", 11);
//        studentDaoImpl.insert("Nuha", 2);
//        studentDaoImpl.insert("Ayan", 15);
/**/


//        System.out.println("------Listing Multiple Records--------");
//        List<Student> students = studentDaoImpl.listStudents();
//
//        for (Student record : students) {
//            System.out.print("ID : " + record.getId());
//            System.out.print(", Name : " + record.getName());
//            System.out.println(", Age : " + record.getAge());
//        }


/**/
//        System.out.println("----Updating Record with ID = 2 -----");
//        studentDaoImpl.update(2, 20);

//        System.out.println("----Listing Record with ID = 2 -----");
//        Student student = studentDaoImpl.getStudent(2);
//        System.out.print("ID : " + student.getId());
//        System.out.print(", Name : " + student.getName());
//        System.out.println(", Age : " + student.getAge());
/**/
//        springContainer.close();

//        System.out.println("This is coming from ModelAndView");
        String helloWorldMessage = "This is coming from ModelAndView";
        return new ModelAndView("hello", "message", helloWorldMessage);
    }
}
