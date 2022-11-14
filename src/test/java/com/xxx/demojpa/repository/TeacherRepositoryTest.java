package com.xxx.demojpa.repository;

import com.xxx.demojpa.entity.Course;
import com.xxx.demojpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){
        Course course= Course.builder()
                .title("DBA")
                .credit(5)
                .build();
        Course courseJava= Course.builder()
                .title("Java")
                .credit(5)
                .build();

        Teacher teacher= Teacher.builder()
                .firstName("Ann")
                .lastName("Smith")
                //.courses(List.of(course,courseJava))
                .build();

        teacherRepository.save(teacher);
    }
}