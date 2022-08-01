package com.kcbgroup.main.soap.bean;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @ Author NMuchiri
 **/
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Course {
    private Integer id;
    private String name;
    private String description;
}
