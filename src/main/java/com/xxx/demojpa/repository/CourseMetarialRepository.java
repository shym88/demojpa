package com.xxx.demojpa.repository;

import com.xxx.demojpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMetarialRepository extends JpaRepository<CourseMaterial,Long> {
}
