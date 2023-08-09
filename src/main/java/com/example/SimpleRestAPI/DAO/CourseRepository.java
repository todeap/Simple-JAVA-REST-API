package com.example.SimpleRestAPI.DAO;

import com.example.SimpleRestAPI.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // You can define custom query methods here if needed
}
