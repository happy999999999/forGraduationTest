package org.linlinjava.litemall.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.linlinjava.litemall.db.dao.CourseMapper;
import org.linlinjava.litemall.db.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ss
 * @Date: 2021/03/03/10:54
 * @Description:
 */
@SpringBootTest
@WebAppConfiguration
@RunWith(SpringRunner.class)
public class CourseTest {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void select()  {
        List<Course> list = courseMapper.selectList(null);
        list.forEach(System.out::println);

    }
}
