package com.kcbgroup.main.repo;

import com.kcbgroup.main.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ Author NMuchiri
 **/
@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
}
