package everyday.day25;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description Junit 测试类命名规范被测试类的类名+Test
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 14:42
 * @Version 1.0
 */
public class JunitTest {

	@Test
	public void junit(int i){
		System.out.println(i);
		System.out.println("jasif");
	}

	// JUnit断言
	@Test
	public void testWTO(){
		int i = 0;
		i++;
		Assert.assertEquals(1, i);
	}
	// JUnit注解
	@Before
	public void testBefore(){
		System.out.println("before");
	}

	@Test
	public void testTest(){
		System.out.println("test");
	}

	@After
	public void testAfter(){
		System.out.println("After");
	}

}
