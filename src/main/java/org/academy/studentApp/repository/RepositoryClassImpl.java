package org.academy.studentApp.repository;

import org.academy.studentApp.model.Student;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClassImpl implements StudentRepository {

    @Override
    public List<Student> findAll(){
        List<Student> students = new ArrayList<Student>();

        Student student = new Student();
        student.setName("Harsini");
        student.setCourse("Spring");

        students.add(student);

        return students;
    }

}
