package com.section6.springboot.learnjpaandhibernate.course.jdbc;

import com.section6.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository //talks to database
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values (?, ?, ?);
            """;

    private static String DELETE_QUERY =
            """
                delete from course 
                where id = ?;    
            """;

    private static String SELECT_QUERY =
            """
                select * from course 
                where id = ?;        
            """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(Long id){
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(Long id){
        //ResultSet -> bean -> row mapper -> course class
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);

    }
}
