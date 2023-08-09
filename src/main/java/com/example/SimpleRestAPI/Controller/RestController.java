package com.example.SimpleRestAPI.Controller;

import com.example.SimpleRestAPI.Entity.Course;
import com.example.SimpleRestAPI.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/getAllCourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/addCourse")
    public String addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return "Course added Successfully in the database";
    }

}
