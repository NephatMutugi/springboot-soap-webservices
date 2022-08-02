package com.kcbgroup.main.service;

import com.kcbgroup.main.entities.Course;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @ Author NMuchiri
 **/
public interface CourseDetailsInterface {
    Course findById(int id);

    // Get all courses details
    List<Course> getAllCourses();

    // Delete a course
    ResponseEntity<?> deleteCourse(int id);
}
