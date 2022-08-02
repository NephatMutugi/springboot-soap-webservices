package com.kcbgroup.main.service;

import com.kcbgroup.main.entities.Course;
import com.kcbgroup.main.exceptions.UserNotFoundException;
import com.kcbgroup.main.repo.CourseRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @ Author NMuchiri
 **/
@Service
@Slf4j
@RequiredArgsConstructor
public class CourseDetailsService implements CourseDetailsInterface{
    /*                      GLOBAL VARIABLES                                  */


    CourseRepo courseRepo;

    // Get details given ID
    public ResponseEntity<Course> findById(int id){
        Optional<Course> optionalCourse = courseRepo.findById(id);
        if (optionalCourse.isPresent()){
             Course course = optionalCourse.get();
             return new ResponseEntity<>(course, HttpStatus.OK);
        } else {
            throw new UserNotFoundException("User with id" + id +" not found.");
        }
    }


    // Get all courses details
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseRepo.findAll(), HttpStatus.OK);
    }

    // Delete a course

    public ResponseEntity<?> deleteCourse(int id){
        Optional<Course> optionalCourse = courseRepo.findById(id);
        if (optionalCourse.isPresent()){
            courseRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
