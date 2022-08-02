package com.kcbgroup.main.repository;

import com.kcbgroup.main.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author NMuchiri
 **/
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
