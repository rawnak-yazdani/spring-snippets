package io.welldev.config.beans;

import io.welldev.dataclass.Student;
import io.welldev.dataclass.StudentMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    //    @Autowired
//    @Qualifier("dataSource")
//    private DataSource dataSource;
//    private JdbcTemplate jdbcTemplateObject;

//    @Autowired
//    @Qualifier("dataSource")
//    @Override
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
//    }

//    @Override
//    public void insert(String name, Integer age) {
//        String SQL = "INSERT INTO Student (name, age) VALUES (?, ?)";
//        jdbcTemplateObject.update(SQL, name, age);
//        System.out.println("Inserted Record Name = " + name + " Age = " + age);
//    }

    @Override
    public Student getStudent(Integer id) {
//        String SQL = "select * from Student where id = ?";
//        Student student = jdbcTemplateObject.queryForObject(SQL, new StudentMapper(), new Object[]{id});

        Session session = sessionFactory.getCurrentSession();
        Student student = session.get(Student.class, id);
//
        return student;
    }

    @Override
    public List<Student> getStudents() {
//        String SQL = "select * from Student";
//        List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());

        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery< Student > cq = cb.createQuery(Student.class);
        Root< Student > root = cq.from(Student.class);
        cq.select(root);
        Query query = session.createQuery(cq);

        return query.getResultList();
    }

//    @Override
//    public void delete(Integer id) {
//        String SQL = "delete from Student where id = ?";
//        jdbcTemplateObject.update(SQL, id);
//        System.out.println("Deleted Record with ID = " + id);
//
//    }
//
//    @Override
//    public void update(Integer id, Integer age) {
//        String SQL = "update Student set age = ? where id = ?";
//        jdbcTemplateObject.update(SQL, age, id);
//        System.out.println("Updated Record with ID = " + id);
//
//    }
}