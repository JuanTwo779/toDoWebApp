package com.section6.springboot.learnjpaandhibernate.course.springDataJpa;

import com.section6.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn AWS Now!", "Juan"));
        repository.save(new Course(2,"Learn Azure Now!", "Juan"));
        repository.save(new Course(3,"Learn DevOps Now!", "Juan"));
        repository.save(new Course(4,"Learn Full Stack Now!", "Juan"));
        repository.save(new Course(5,"Cracking the coding interview", "Gayle"));
        repository.save(new Course(6,"Leetcode 101", "Gayle"));

        repository.deleteById(1l);


        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("Gayle"));
        System.out.println(repository.findByName("Learn Azure Now!"));
    }
}
