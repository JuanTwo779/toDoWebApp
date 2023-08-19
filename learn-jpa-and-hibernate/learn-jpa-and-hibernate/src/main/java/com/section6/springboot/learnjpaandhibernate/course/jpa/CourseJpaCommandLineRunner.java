package com.section6.springboot.learnjpaandhibernate.course.jpa;

import com.section6.springboot.learnjpaandhibernate.course.Course;
import com.section6.springboot.learnjpaandhibernate.course.jdbc.CourseJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1,"Learn AWS Now!", "Juan"));
//        repository.insert(new Course(2,"Learn Azure Now!", "Juan"));
//        repository.insert(new Course(3,"Learn DevOps Now!", "Juan"));
//        repository.insert(new Course(4,"Learn Full Stack Now!", "Juan"));
//
//        repository.deleteById(1);
//
//        System.out.println(repository.findById(2));
//        System.out.println(repository.findById(3));
    }
}
