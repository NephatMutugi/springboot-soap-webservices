package com.kcbgroup.main.service;

import com.kcbgroup.main.entities.Course;
import com.kcbgroup.main.exceptions.UserNotFoundException;
import com.kcbgroup.main.repo.CourseRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @ Author NMuchiri
 **/
@Component
@Slf4j
@RequiredArgsConstructor
public class CourseDetailsService {
    /*                      GLOBAL VARIABLES                                  */

    final CourseRepo courseRepo;

    // Get details given ID
    public Course findById(int id){
        Optional<Course> optionalCourse = courseRepo.findById(id);
        if (optionalCourse.isPresent()){
            return optionalCourse.get();
        } else {
            throw new UserNotFoundException("User with id" + id +" not found.");
        }
    }


    // Get all courses details

    // Delete a course
}
