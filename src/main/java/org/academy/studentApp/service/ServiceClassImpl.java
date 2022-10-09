package org.academy.studentApp.service;

import org.academy.studentApp.model.Student;
import org.academy.studentApp.repository.RepositoryClassImpl;
import org.academy.studentApp.repository.StudentRepository;

import java.util.List;

public class ServiceClassImpl implements StudentService {

    private StudentRepository repository = new RepositoryClassImpl();

    public List<Student> findAll(){
        return repository.findAll();
    }
}
