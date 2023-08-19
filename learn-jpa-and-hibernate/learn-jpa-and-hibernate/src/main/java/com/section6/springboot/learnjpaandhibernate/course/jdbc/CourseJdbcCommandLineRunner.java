package com.section6.springboot.learnjpaandhibernate.course.jdbc;

import com.section6.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1,"Learn AWS Now!", "Juan"));
//        repository.insert(new Course(2,"Learn Azure Now!", "Juan"));
//        repository.insert(new Course(3,"Learn DevOps Now!", "Juan"));
//
//        repository.deleteById(1L);
//
//        System.out.println(repository.findById(2L));
//        System.out.println(repository.findById(3L));
    }
}
