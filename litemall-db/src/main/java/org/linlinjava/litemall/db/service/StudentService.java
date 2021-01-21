package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.StudentMapper;
import org.linlinjava.litemall.db.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ss
 * @Date: 2021/01/21/11:18
 * @Description:
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getStudentList(){
        return studentMapper.getStudentList();
    }


}
