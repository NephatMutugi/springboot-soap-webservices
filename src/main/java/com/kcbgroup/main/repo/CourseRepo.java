package com.kcbgroup.main.repo;

import com.kcbgroup.main.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author NMuchiri
 **/
public interface CourseRepo extends JpaRepository<Course, Integer> {
}
