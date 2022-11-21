import com.ssm.mybatis.mapper.StuMapper;
import com.ssm.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : PACKAGE_NAME
 * @date :2022/11/18 17:06
 */
public class stuTest {
    @Test
    public void getStu() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        System.out.println(mapper.getStuList());
    }

    @Test
    public void StuList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        System.out.println(mapper.StuList());
    }
    //-------------两表联查的方式

    /**
     * 第一种resultMap映射属性
     */
    @Test
    public void StuListAndClazz() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        System.out.println(mapper.StuListAndClazz());
    }

    /**
     * 第二种创建对应实体
     */
    @Test
    public void StuListAndClazzTwo() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        System.out.println(mapper.StuListAndClazzTwo());
    }

    /**
     * 第三种分步查询
     */
    @Test
    public void StuListAndClazzThree() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        System.out.println(mapper.StuListAndClazzThree());
    }

    @Test
    public void StuListAndClazzFour() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        System.out.println(mapper.StuListAndClazzFour());
    }
}
