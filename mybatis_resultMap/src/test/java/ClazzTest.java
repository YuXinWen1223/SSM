import com.ssm.mybatis.mapper.ClazzMapper;
import com.ssm.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : PACKAGE_NAME
 * @date :2022/11/21 14:33
 */
public class ClazzTest {
    @Test
    public void getClazzAndList() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        ClazzMapper mapper = session.getMapper(ClazzMapper.class);
        System.out.println(mapper.getClazzAndList());
    }

    @Test
    public void getClazzAndListTwo() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        ClazzMapper mapper = session.getMapper(ClazzMapper.class);
        System.out.println(mapper.getClazzAndListTwo());
    }
}
