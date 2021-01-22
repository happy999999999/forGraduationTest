package org.linlinjava.litemall.db.dao;


import org.apache.ibatis.annotations.Mapper;
import org.linlinjava.litemall.db.domain.Course;

import java.util.List;

@Mapper
public interface CourseMapper {

    List<Course> getCourseList();
}
