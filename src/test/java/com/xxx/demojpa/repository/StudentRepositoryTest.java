package com.xxx.demojpa.repository;

import com.xxx.demojpa.entity.Guardian;
import com.xxx.demojpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student=Student.builder()
                .emailId("a@a.com")
                .firstName("aaa")
                .lastName("bbb")
                //.guardianEmail("b@b.com")
                //.guardianMobile("5444444444")
                .build();
        studentRepository.save(student);
    }
    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .name("xxx")
                .email("x@x.com")
                .mobile("444554455")
                .build();

        Student student=Student.builder()
                .emailId("b@a.com")
                .firstName("aaa")
                .lastName("bbb")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }

    @Test
    public void printAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);
    }

    @Test
    public void printAllStudentByFirstName(){
        List<Student> studentList = studentRepository.findByFirstName("aaa");
        System.out.println(studentList);
    }

    @Test
    public void printAllStudentByFirstNameContaining(){
        List<Student> studentList = studentRepository.findByFirstNameContaining("aa");
        System.out.println(studentList);
    }

    @Test
    public void printAllStudenBasedOnGuardianName(){
        List<Student> studentList = studentRepository.findByGuardianName("ccc");
        System.out.println(studentList);
    }

    @Test
    public void printGetStudentByEmailAdress(){
        Student student = studentRepository.getStudentByEmailAddress("a@a.com");
        System.out.println(student);
    }

    @Test
    public void printGetStudentFirstNameByEmailAdress(){
        String studentname = studentRepository.getStudentFirstNameByEmailAddress("a@a.com");
        System.out.println(studentname);
    }

    @Test
    public void printGetStudentByEmailAdressNative(){
        Student student = studentRepository.getStudentByEmailAddressNative("a@a.com");
        System.out.println(student);
    }

    @Test
    public void printGetStudentByEmailAdressNativeNamedParam(){
        Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("c@a.com");
        System.out.println(student);
    }

    @Test
    public void updateStudentByNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId("John","c@a.com");
    }

}