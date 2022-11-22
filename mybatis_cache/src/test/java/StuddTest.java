import com.ssm.mybatis.entity.Studd;
import com.ssm.mybatis.mapper.StuddMapper;
import com.ssm.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : PACKAGE_NAME
 * @date :2022/11/21 15:25
 */
public class StuddTest {
    /**
     * 一级缓存测试
     */
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

    /**
     * 二级缓存是SqlSessionFactory级别，通过同一个SqlSessionFactory创建的SqlSession查询的结果会被
     * 缓存；此后若再次执行相同的查询语句，结果就会从缓存中获取
     * 二级缓存开启的条件：
     * a>在核心配置文件中，设置全局配置属性cacheEnabled="true"，默认为true，不需要设置
     * b>在映射文件中设置标签<cache/>
     * c>二级缓存必须在SqlSession关闭或提交之后有效
     * d>查询的数据所转换的实体类类型必须实现序列化的接口
     * ----------------------------------
     * 使二级缓存失效的情况：
     * 两次查询之间执行了任意的增删改，会使一级和二级缓存同时失效
     * MyBatis缓存查询的顺序
     * 先查询二级缓存，因为二级缓存中可能会有其他程序已经查出来的数据，可以拿来直接使用。
     * 如果二级缓存没有命中，再查询一级缓存
     * 如果一级缓存也没有命中，则查询数据库
     * SqlSession关闭之后，一级缓存中的数据会写入二级缓存
     */
    @Test
    public void getStuddTwo() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StuddMapper mapper = sqlSession.getMapper(StuddMapper.class);
        Studd studd = new Studd();
        studd.setsAge("20");
        studd.setsName("余欣文");
        Studd studd2 = new Studd();
        studd2.setsAge("20");
        studd2.setsName("余欣文");
        System.out.println(mapper.getStudd(studd));
        sqlSession.close();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession session = sqlSessionFactory.openSession(true);
        StuddMapper mapper1 = session.getMapper(StuddMapper.class);
        System.out.println(mapper1.getStudd(studd));
        session.close();


    }
}
