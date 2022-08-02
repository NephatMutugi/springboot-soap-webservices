package com.kcbgroup.main.service;

import com.kcbgroup.main.soap.bean.Course;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @ Author NMuchiri
 **/
public interface CourseDetailsInterface {
    ResponseEntity<Course> findById(Integer id);

    // Get all courses details
    ResponseEntity<List<Course>> getAllCourses();

    // Delete a course
    ResponseEntity<?> deleteCourse(Integer id);
}
