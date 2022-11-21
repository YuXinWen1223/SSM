import com.ssm.mybatis.entity.Student;
import com.ssm.mybatis.mapper.StudentMapper;
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
 * @mingcheng : mybatis
 * @模块 : PACKAGE_NAME
 * @date :2022/11/17 14:54
 */

public class StudentTest {
    @Test
    public void addStudent() throws IOException {
        //读取MyBatis的核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //通过代理模式创建UserMapper接口的代理实现类对象
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配
        //创建实体类
        Student student = new Student();
        student.setAddress("上海");
        student.setBirthday("2015");
        student.setCid(1);
        student.setSname("Student");
        student.setSsex("女");
        //映射文件中的SQL标签，并执行标签中的SQL语句
        boolean result = mapper.addStudent(student);
        //sqlSession.commit();
        System.out.println("结果：" + result);
        sqlSession.close();
    }

    @Test
    public void udpateStudent() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setSno(16);
        student.setAddress("上海");
        student.setBirthday("2015");
        student.setCid(1);
        student.setSname("哈哈");
        student.setSsex("女");
        boolean res = mapper.updateStudent(student);
    }

    @Test
    public void delectStudent() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        mapper.delectStudent(16);
    }

    @Test
    public void getByIdStudent() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(mapper.getByIdStudent(1));

    }

    /**
     * 获取学生列表
     */
    @Test
    public void getStudentList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(mapper.getStudentList());

    }
}
