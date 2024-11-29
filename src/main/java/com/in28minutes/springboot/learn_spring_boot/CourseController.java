package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Aws", "in28Minutes"),
                new Course(2, "Learn Devops", "in28Minutes"),
                new Course(3, "Learn Azure", "in28Minutes"),
                new Course(5, "Learn Go", "in28Minutes")
        );
    }
}
