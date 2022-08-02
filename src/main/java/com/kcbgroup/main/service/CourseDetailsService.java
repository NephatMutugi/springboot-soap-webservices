package com.kcbgroup.main.service;

import com.kcbgroup.main.entities.Course;
import com.kcbgroup.main.exceptions.UserNotFoundException;
import com.kcbgroup.main.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @ Author NMuchiri
 **/

@Slf4j
@Component
public class CourseDetailsService implements CourseDetailsInterface{
    /*                      GLOBAL VARIABLES                                  */

    @Autowired
    CourseRepository courseRepository;

    // Get details given ID
    public ResponseEntity<Course> findById(Integer id){
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if (optionalCourse.isPresent()){
             Course course = optionalCourse.get();
             return new ResponseEntity<>(course, HttpStatus.OK);
        } else {
            throw new UserNotFoundException("User with id" + id +" not found.");
        }
    }


    // Get all courses details
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    // Delete a course

    public ResponseEntity<?> deleteCourse(Integer id){
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if (optionalCourse.isPresent()){
            courseRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
