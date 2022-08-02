package com.kcbgroup.main.service.impl;

import com.kcbgroup.main.service.CourseDetailsInterface;
import com.kcbgroup.main.soap.bean.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author NMuchiri
 **/

@Service
public class CourseDetailsService implements CourseDetailsInterface {
    @Override
    public ResponseEntity<Course> findById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Course>> getAllCourses() {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteCourse(Integer id) {
        return null;
    }
    /*                      GLOBAL VARIABLES                                  */


    // Get details given ID

}
