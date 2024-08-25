package com.atuluttam.springBootDatabase.studentRepository;


import com.atuluttam.springBootDatabase.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

   // @Autowired
   //private Student s;

   private JdbcTemplate jdbc;


    public void save(Student s)
    {
        String sql = "insert into student (rollno, name, marks) values(?,?,?)";
        int rows =         jdbc.update(sql, s.getRoll(), s.getName(), s.getMarks());
        System.out.println("Rows added " +rows);
        System.out.println("Student Added");
    }

    public List<Student> findAll()
    {
        String sql = "select * from student";
        //
        RowMapper<Student> rm = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student s = new Student();
                s.setRoll(rs.getInt(1));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
        /*List<Student> studentList = new ArrayList<>();*/

        return jdbc.query(sql, rm);
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
