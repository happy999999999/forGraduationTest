package org.linlinjava.litemall.db.dao;

import org.apache.ibatis.annotations.Mapper;
import org.linlinjava.litemall.db.domain.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ss
 * @Date: 2021/01/21/11:16
 * @Description:
 */
@Mapper
public interface StudentMapper {

    List<Student> getStudentList();
}
