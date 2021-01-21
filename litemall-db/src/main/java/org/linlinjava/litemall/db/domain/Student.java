package org.linlinjava.litemall.db.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ss
 * @Date: 2021/01/20/15:25
 * @Description:
 */
@Data
public class Student {

    private Integer id;//主键id

    private Integer studentId;//学生id

    private String studentName;//学生姓名

    private Byte studentAge;//学生年龄

    private Byte sex;//性别：0女，1男

    private Byte grade;//年级 1大一，2大二类推

    private String qqNumber;//qq号码

    private String phoneNumber;//手机号码

    private String dormitory;//宿舍位置

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Timestamp admissionTime;//入学时间

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Timestamp graduationTime;//毕业时间

    private Integer collegeId;//学院id

    private Integer professionalId;//专业id

    private Integer counselorId;//辅导员id

    private Integer tutorId;//导师id




}
