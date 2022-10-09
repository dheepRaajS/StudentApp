package org.academy.studentApp.repository;

import org.academy.studentApp.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
