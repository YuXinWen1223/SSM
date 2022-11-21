import com.ssm.mybatis.entity.Studd;
import com.ssm.mybatis.mapper.StuddMapper;
import com.ssm.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : PACKAGE_NAME
 * @date :2022/11/21 15:25
 */
public class StuddTest {
    @Test
    public void getStudd() {
        //一级缓存是SqlSession级别的，通过同一个SqlSession查询的数据会被缓存，下次查询相同的数据，就
        //会从缓存中直接获取，不会从数据库重新访问
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuddMapper mapper = sqlSession.getMapper(StuddMapper.class);
        Studd studd = new Studd();
        studd.setsAge("20");
        studd.setsName("余欣文");
        Studd studd2 = new Studd();
        studd2.setsAge("20");
        studd2.setsName("余欣文");
        //TODO 日志只打印一次
        System.out.println(mapper.getStudd(studd));
        System.out.println(mapper.getStudd(studd2));
        //TODO 使一级缓存失效的四种情况：
        //1) 不同的SqlSession对应不同的一级缓存
        //2) 同一个SqlSession但是查询条件不同
        //3) 同一个SqlSession两次查询期间执行了任何一次增删改操作
        //4) 同一个SqlSession两次查询期间手动清空了缓存
    }
}
