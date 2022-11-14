package com.xxx.demojpa.repository;

import com.xxx.demojpa.entity.Course;
import com.xxx.demojpa.entity.CourseMaterial;
import com.xxx.demojpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMetarialRepositoryTest {

    @Autowired
    private CourseMetarialRepository repository;

    @Test
    public void saveCourseMaterial(){
        Course course= Course.builder()
                .title("DSA")
                .credit(6)
                .build();

       /* CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .course(course)
                .build();*/

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.xxxx.com")
                .course(course)
                .build();

        repository.save(courseMaterial);
    }

    @Test
    public void printAllCoursesMaterials(){
        List<CourseMaterial> courseMaterials = repository.findAll();
        System.out.println(courseMaterials);
    }
}