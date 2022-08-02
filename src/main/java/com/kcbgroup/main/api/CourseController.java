package com.kcbgroup.main.api;

import com.kcbgroup.main.entities.Course;
import com.kcbgroup.main.service.CourseDetailsService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Author NMuchiri
 **/
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("api/v1/soap")
public class CourseController {
    /*                  GLOBAL VARIABLES                    */
    final CourseDetailsService detailsService;

    @GetMapping
    public ResponseEntity<List<Course>> returnAllCourses() {
        return detailsService.getAllCourses();
    }
}
