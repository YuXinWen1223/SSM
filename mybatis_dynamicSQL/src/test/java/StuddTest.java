import com.ssm.mybatis.entity.Studd;
import com.ssm.mybatis.mapper.StuddMapper;
import com.ssm.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : PACKAGE_NAME
 * @date :2022/11/21 15:25
 */
public class StuddTest {
    @Test
    public void getStudd() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuddMapper mapper = sqlSession.getMapper(StuddMapper.class);
        Studd studd = new Studd();
        studd.setsAge("20");
        studd.setsName("余欣文");
        System.out.println(mapper.getStudd(studd));
    }

    @Test
    public void getStuddTwo() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuddMapper mapper = sqlSession.getMapper(StuddMapper.class);
        Studd studd = new Studd();
        studd.setsAge("20");
        studd.setsName("余欣文");
        System.out.println(mapper.getStuddTwo(studd));
    }

    @Test
    public void getStuddThree() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuddMapper mapper = sqlSession.getMapper(StuddMapper.class);
        Studd studd = new Studd();
        studd.setsAge("20");
        studd.setsName("余欣文");
        System.out.println(mapper.getStuddThree(studd));
    }

    @Test
    public void getStuddFour() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuddMapper mapper = sqlSession.getMapper(StuddMapper.class);
        Studd studd = new Studd();
        studd.setsAge("20");
        studd.setsName("余欣文");
        System.out.println(mapper.getStuddFour(studd));
    }

    @Test
    public void addBatch() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuddMapper mapper = sqlSession.getMapper(StuddMapper.class);
        System.out.println(mapper.addBatch(Arrays.asList(new Studd(null, "haha", "18"), new Studd(null, "hw", "23"), new Studd(null, "asList", "9"))));
    }

    @Test
    public void delBatch() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuddMapper mapper = sqlSession.getMapper(StuddMapper.class);
        System.out.println(mapper.delBatch(new Integer[]{1006, 1007, 1008}));
    }
}
