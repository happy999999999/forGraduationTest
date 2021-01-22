package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.CourseMapper;
import org.linlinjava.litemall.db.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> getCourseList(){
        return courseMapper.getCourseList();
    }
}
