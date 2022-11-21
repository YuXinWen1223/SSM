package com.ssm.mybatis.mapper;

import com.ssm.mybatis.entity.Student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
     * 保存学生并获取主键
     *
     * @return boolean
     */
    boolean saveStudent(Student student);

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

    /**
     * 得到sname学生
     *
     * @param name 名字
     * @return {@link Student}
     */
    Student getSnameStudent(@Param("name") String name);

    /**
     * 得到sname学生数
     *
     * @param name 名字
     * @return {@link Integer}
     */
    Integer getSnameStudentCount(@Param("name") String name);

    /**
     * getget sname地图
     *
     * @param name 名字
     * @return {@link Map}<{@link String}, {@link Object}>
     */
    Map<String, Object> getgetSnameMap(String name);

    /**
     * getget sname地图列表
     * getget sname地图列表
     *
     * @return {@link Map}<{@link String}, {@link Object}>
     */
    @MapKey("sno")
    Map<String, Object> getgetSnameMapList();
    //List<Map<String, Object>> getgetSnameMapList();


    /**
     * 就像sname学生
     *
     * @param name 名字
     * @return {@link List}<{@link Student}>
     */
    List<Student> getLikeSnameStudent(@Param("name") String name);

    /**
     * 动态表名
     *
     * @param name 名字
     * @return {@link List}<{@link Student}>
     */
    List<Student> tableName(@Param("name") String name);
}
