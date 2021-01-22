package org.linlinjava.litemall.admin.web;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.linlinjava.litemall.admin.annotation.RequiresPermissionsDesc;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.domain.Course;
import org.linlinjava.litemall.db.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/course")
@Validated
public class AdminCourseController {

    @Autowired
    private CourseService courseService;

    @RequiresPermissions("admin:course:list")
    @RequiresPermissionsDesc(menu = {"系统管理", "对象存储"}, button = "查询")
    @GetMapping("/list")
    public Object list() {
        List<Course> courseList = courseService.getCourseList();
        return ResponseUtil.okList(courseList);
    }

}
