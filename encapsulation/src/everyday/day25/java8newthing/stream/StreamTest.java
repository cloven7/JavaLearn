package everyday.day25.java8newthing.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 16:45
 * @Version 1.0
 */
public class StreamTest {

	@Test
	public void createTest(){
		List<String> list = new ArrayList<>();
		Stream<String> stringStream = list.stream();
	}

}
