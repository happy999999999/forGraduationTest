package org.linlinjava.litemall.db.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ss
 * @Date: 2021/01/21/14:54
 * @Description:
 */
@Data
@TableName(value = "course")
public class Course {

    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;//id

    private String name;//名字

    //若没有开启驼峰命名，或者表中列名不符合驼峰规则，可通过该注解指定数据库表中的列名，exist标明数据表中有没有对应列
    @TableField(value = "total_class_hours",exist = true)
    private Integer totalClassHours;//课程总课时

    private Integer week;//单双周0双周1单周

    private Integer status;



}
