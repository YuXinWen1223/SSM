package com.ssm.mybatis.mapper;

import com.ssm.mybatis.entity.Studd;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.ssm.mybatis.mapper
 * @date :2022/11/21 15:21
 */

public interface StuddMapper {
    /**
     * 动态SQL《if》标签
     *
     * @return {@link List}<{@link Studd}>
     */
    List<Studd> getStudd(Studd studd);

    /**
     * 动态标签《where》
     *
     * @param studd studd
     * @return {@link List}<{@link Studd}>
     */
    List<Studd> getStuddTwo(Studd studd);

    /**
     * 动态SQL 《trim》
     *
     * @param studd studd
     * @return {@link List}<{@link Studd}>
     */
    List<Studd> getStuddThree(Studd studd);

    /**
     * 动态SQL 《choose、when、otherwise》
     *
     * @param studd studd
     * @return {@link List}<{@link Studd}>
     */
    List<Studd> getStuddFour(Studd studd);

    /**
     * 添加批
     *
     * @param studd studd
     * @return boolean
     */
    boolean addBatch(@Param("studd") List<Studd> studd);

    /**
     * 德尔批
     *
     * @param ids id
     * @return boolean
     */
    boolean delBatch(@Param("ids") Integer[] ids);
}
