package com.kcbgroup.main.api;

import com.kcbgroup.main.service.CourseDetailsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author NMuchiri
 **/
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("api/v1/soap")
public class CourseController {
    final CourseDetailsService detailsService;


}
