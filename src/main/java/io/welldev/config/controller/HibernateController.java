package io.welldev.config.controller;

import io.welldev.config.beans.StudentDaoImpl;
import io.welldev.config.service.StudentService;
import io.welldev.dataclass.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HibernateController {
//    @Autowired
//    StudentDaoImpl studentDaoImpl;
    @Autowired
    private StudentService studentService;

    @GetMapping("/hibernate")
    public String hello(Model model) {

//        System.out.println("------Listing Multiple Records--------");
//        List<Student> students = studentDaoImpl.listStudents();
//
//        for (Student record : students) {
//            System.out.print("ID : " + record.getId());
//            System.out.print(", Name : " + record.getName());
//            System.out.println(", Age : " + record.getAge());
//        }
        Student student = studentService.getStudent(2);
        System.out.println(student.getName());

        model.addAttribute("tipu", "sultan");
        return "hello2";
    }
}
