package com.ssm.mybatis.mapper;

import com.ssm.mybatis.entity.Clazz;

import java.util.List;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.ssm.mybatis.mapper
 * @date :2022/11/18 16:47
 */
public interface ClazzMapper {
    /**
     * 第三种分步查询
     *
     * @param cid cid
     * @return {@link Clazz}
     */
    Clazz getClazzList(Integer cid);

    /**
     * 一对多查询
     *
     * @return {@link List}<{@link Clazz}>
     */
    List<Clazz> getClazzAndList();

    /**
     * 一对多查询分步查询
     *
     * @return {@link List}<{@link Clazz}>
     */
    List<Clazz> getClazzAndListTwo();
}
