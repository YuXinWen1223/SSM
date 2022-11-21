package com.ssm.mybatis.mapper;

import com.ssm.mybatis.entity.Stu;
import com.ssm.mybatis.entity.StuAndClazz;

import java.util.List;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.ssm.mybatis.mapper
 * @date :2022/11/18 16:46
 */
public interface StuMapper {
    /**
     * 得到斯图列表
     *
     * @return {@link List}<{@link Stu}>
     */
    List<Stu> getStuList();

    /**
     * 斯图列表
     *
     * @return {@link List}<{@link Stu}>
     */
    List<Stu> StuList();

    /**
     * 第一种resultMap映射属性查询学生所在的班级
     *
     * @return {@link List}<{@link Stu}>
     */
    List<Stu> StuListAndClazz();

    /**
     * 第二种创建对应实体查询
     *
     * @return {@link List}<{@link StuAndClazz}>
     */
    List<StuAndClazz> StuListAndClazzTwo();

    /**
     * 第四种resultMap映射属性查询学生所在的班级
     *
     * @return {@link List}<{@link Stu}>
     */
    List<Stu> StuListAndClazzThree();

    /**
     * 第三种分步查询
     *
     * @return {@link List}<{@link Stu}>
     */
    List<Stu> StuListAndClazzFour();

    /**
     * 一对多查询分步查询
     *
     * @param cid cid
     * @return {@link List}<{@link Stu}>
     */
    List<Stu> getStuListAndClazzTwo(Integer cid);
}
