package io.welldev.configuration.beans;

import io.welldev.pojo.Student;
import io.welldev.pojo.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao {

    //    @Autowired
//    @Qualifier("dataSource")
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    @Autowired
    @Qualifier("transactionManager")
    private PlatformTransactionManager platformTransactionManager;

    @Autowired
    @Qualifier("dataSource")
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(String name, Integer age) {
        String SQL = "INSERT INTO Student (name, age) VALUES (?, ?)";
        jdbcTemplate.update(SQL, name, age);
        System.out.println("Inserted Record Name = " + name + " Age = " + age);
    }

    @Override
    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplate.queryForObject(SQL, new StudentMapper(), new Object[]{id});

        return student;
    }

    @Override
    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());

        return students;
    }

    @Override
    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id);

    }

    @Override
    public void update(Integer id, Integer age) {
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplate.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id);

    }

    public void performMultipleActions(String name, Integer age, Integer id) {
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus transactionStatus = platformTransactionManager.getTransaction(transactionDefinition);

        try {
            String SQL1 = "INSERT INTO Student (name, age) VALUES (?, ?)";
            jdbcTemplate.update(SQL1, name, age);

            String SQL2 = "select * from Student where id = ?";
            Student student = jdbcTemplate.queryForObject(SQL2, new StudentMapper(), new Object[]{id});

            System.out.println("Inserted Record Name = " + name + " Age = " + age);
            System.out.println("Student: " + student.getName() + ", " + student.getAge());

            platformTransactionManager.commit(transactionStatus);
        } catch (Exception exception) {
            System.out.println("Transaction Failed: " + exception);
            platformTransactionManager.rollback(transactionStatus);
        }
    }
}
