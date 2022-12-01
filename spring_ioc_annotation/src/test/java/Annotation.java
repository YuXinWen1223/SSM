import com.spring.ioc.annotation.controller.UserController;
import com.spring.ioc.annotation.mapper.impl.UserMapperImpl;
import com.spring.ioc.annotation.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : PACKAGE_NAME
 * @date :2022/12/1 15:41
 */
public class Annotation {
    @Test
    public void test() {
        //在我们使用XML方式管理bean的时候，每个bean都有一个唯一标识，便于在其他地方引用。现在使用
        //注解后，每个组件仍然应该有一个唯一标识
        /**
         * 默认情况
         * 类名首字母小写就是bean的id。例如：UserController类对应的bean的id就是userController。
         * 自定义bean的id
         * 可通过标识组件的注解的value属性设置自定义的bean的id
         * @Service("userService")
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("userController",UserController.class));
        System.out.println(context.getBean("userMapperImpl",UserMapperImpl.class));
        System.out.println(context.getBean("userServiceImpl",UserServiceImpl.class));
    }

    /**
     * 首先根据所需要的组件类型到IOC容器中查找
     * 能够找到唯一的bean：直接执行装配
     * 如果完全找不到匹配这个类型的bean：装配失败
     * 和所需类型匹配的bean不止一个
     * 没有@Qualifier注解：根据@Autowired标记位置成员变量的变量名作为bean的id进行
     * 匹配
     * 能够找到：执行装配
     * 找不到：装配失败
     * 使用@Qualifier注解：根据@Qualifier注解中指定的名称作为bean的id进行匹配
     * 能够找到：执行装配
     * 找不到：装配失败
     * @Autowired中有属性required，默认值为true，因此在自动装配无法找到相应的bean时，会装
     * 配失败
     * 可以将属性required的值设置为true，则表示能装就装，装不上就不装，此时自动装配的属性为
     * 默认值
     * 但是实际开发时，基本上所有需要装配组件的地方都是必须装配的，用不上这个属性
     */
    @Test
    public void test2() {
        /**
         * @Autowired注解可以标记在构造器和set方法上
         * 在成员变量上直接标记@Autowired注解即可完成自动装配，不需要提供setXxx()方法。以后我们在项
         * 目中的正式用法就是这样
         *
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.save();
    }
}
