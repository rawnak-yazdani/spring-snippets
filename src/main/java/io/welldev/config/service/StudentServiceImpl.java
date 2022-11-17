package io.welldev.config.service;

import io.welldev.config.beans.StudentDao;
import io.welldev.dataclass.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    @Override
    @Transactional
    public Student getStudent(int theId) {
        return studentDao.getStudent(theId);
    }
}
