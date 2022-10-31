package io.welldev;

import io.welldev.configuration.JDBCConfig;
import io.welldev.configuration.beans.StudentDaoImpl;
import io.welldev.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         *  AnnotationConfigApplicationContext is Spring IoC container, and it is using ConfigurationMetadata (configuration metadata)
         *  AnnotationConfigApplicationContext Container will create the singleton beans/objects whether springContainer.getBean() is used or not (BeanFactory doesn't follow this)
         *  But it will create prototype beans/objects only when springContainer.getBean() is called.
         */
        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(JDBCConfig.class);

        /**
         * Object is created by the spring container and inversion of control is occurring (not DI)
         */
        StudentDaoImpl studentDaoImpl = (StudentDaoImpl) springContainer.getBean(StudentDaoImpl.class);

        System.out.println("------Records Creation--------");
        studentDaoImpl.insert("Zara", 11);
        studentDaoImpl.insert("Nuha", 2);
        studentDaoImpl.insert("Ayan", 15);

        System.out.println("------Listing Multiple Records--------");
        List<Student> students = studentDaoImpl.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----");
        studentDaoImpl.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----");
        Student student = studentDaoImpl.getStudent(2);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getAge());

        springContainer.close();

    }
}