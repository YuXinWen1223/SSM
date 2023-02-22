package ssm;


import com.ssm.proxy.Calculator;
import com.ssm.proxy.CalculatorPureImpl;
import com.ssm.proxy.CalculatorStaticProxy;
import com.ssm.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.ssm
 * @date :2022/12/27 20:29
 */
public class test {
    @Test
    public void testCalculatorStaticProxy() {
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorPureImpl());
        proxy.add(1,3);

    }
    @Test
    public void testDynamicProxy() {

        ProxyFactory factory = new ProxyFactory(new CalculatorPureImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.add(1, 4);

    }
}
