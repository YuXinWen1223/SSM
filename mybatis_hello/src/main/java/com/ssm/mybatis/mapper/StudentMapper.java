package com.ssm.mybatis.mapper;

import com.ssm.mybatis.entity.Student;

import java.util.List;

/**
 * @author : yuxinwen
 * @mingcheng : mybatis
 * @模块 : org.ssm.mybatis.mapper
 * @date :2022/11/17 14:42
 */
public interface StudentMapper {
    /**
     * 增加学生
     *
     * @param student 学生
     * @return boolean
     */
    boolean addStudent(Student student);

    /**
     * 保存学生
     *
     * @return boolean
     */
    boolean saveStudent();

    /**
     * 更新学生
     *
     * @param student 学生
     * @return boolean
     */
    boolean updateStudent(Student student);


    /**
     * 删除学生
     *
     * @param id id
     * @return boolean
     */
    boolean delectStudent(Integer id);

    /**
     * 通过id学生
     *
     * @param id id
     * @return {@link Student}
     */
    Student getByIdStudent(Integer id);

    /**
     * 查询学生列表
     *
     * @return {@link List}<{@link Student}>
     */
    List<Student> getStudentList();
}
