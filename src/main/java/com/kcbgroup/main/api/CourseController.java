package com.kcbgroup.main.api;

import com.kcbgroup.main.service.CourseDetailsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author NMuchiri
 **/
@RestController
@Slf4j
@RequiredArgsConstructor
public class CourseController {
    final CourseDetailsService detailsService;
}
