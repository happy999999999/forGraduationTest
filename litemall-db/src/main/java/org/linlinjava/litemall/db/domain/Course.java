package org.linlinjava.litemall.db.domain;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ss
 * @Date: 2021/01/21/14:54
 * @Description:
 */
@Data
public class Course {

    private Integer id;//id

    private Integer courseId;//课程id

    private String courseName;//课程名子

    private Integer teacherId;//上课教师id

    private Integer studentNum;//学生人数

    private Integer courseTime;//上课课时




}
