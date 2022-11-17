package io.welldev.config.beans;

import io.welldev.dataclass.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDao {
    public void setDataSource(DataSource ds);

    public void insert(String name, Integer age);

    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public void delete(Integer id);

    public void update(Integer id, Integer age);
}

/*
CREATE TABLE public.student (
    name varchar NOT NULL,
    id serial4 NOT NULL,
    age integer NOT NULL
);
*/
