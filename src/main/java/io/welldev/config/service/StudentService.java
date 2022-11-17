package io.welldev.config.service;

import io.welldev.dataclass.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudents();
    public Student getStudent(int theId);
}
