package com.atuluttam.springBootDatabase;

import com.atuluttam.springBootDatabase.model.Student;
import com.atuluttam.springBootDatabase.studentService.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootDatabaseApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =  SpringApplication.run(SpringBootDatabaseApplication.class, args);
		Student s1 = ctx.getBean(Student.class);
		s1.setName("Atul");
		s1.setMarks(50);
		s1.setRoll(100);
	StudentService ss = ctx.getBean(StudentService.class);
		ss.addStudent(s1);

   List<Student> sAll = ss.getStudents();

		System.out.println(sAll);

	}

}
