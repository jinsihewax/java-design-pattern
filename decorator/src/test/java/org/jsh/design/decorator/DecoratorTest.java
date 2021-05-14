package org.jsh.design.decorator;

import org.jsh.design.decorator.decorator.ADecorator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DecoratorTest {

	/**
	 * 装饰器
	 */
	@Autowired
	private ADecorator d;

	@Autowired
	private A b;

	@Autowired
	private A c;

	@Test
	public void testDecorator() {
		// 添加要装饰的对象
		d.set(b);
		d.doTest();
		
		d.set(c);
		d.doTest();
	}

}