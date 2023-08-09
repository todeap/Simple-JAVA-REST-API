package com.example.SimpleRestAPI.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private int course_id;
    private String course_des;
    private String course_name;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_des() {
        return course_des;
    }

    public void setCourse_des(String course_des) {
        this.course_des = course_des;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String toString() {
        return "Course_name: "+this.course_name+" Course_Id: "+this.course_id+" Course_des: "+this.course_des;
    }

}
