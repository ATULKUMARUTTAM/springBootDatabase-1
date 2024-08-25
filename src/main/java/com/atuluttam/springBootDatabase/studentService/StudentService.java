package com.atuluttam.springBootDatabase.studentService;


import com.atuluttam.springBootDatabase.model.Student;
import com.atuluttam.springBootDatabase.studentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    Student s;

    @Autowired
    StudentRepository sr;
    public void addStudent(Student s)
    {
        //System.out.println("Student added");
        sr.save(s);

    }

   public List<Student> getStudents()
    {
       return sr.findAll();
    }

}
