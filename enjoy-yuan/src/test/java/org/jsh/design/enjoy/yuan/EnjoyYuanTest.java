package org.jsh.design.enjoy.yuan;

import org.jsh.design.enjoy.yuan.factory.Factory;
import org.jsh.design.enjoy.yuan.impl.B;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class EnjoyYuanTest {

	@Autowired
	private Factory a;

	@Test
	public void testEnjoyYuan() {
		// 使用一个对象
		B b = a.getTyg("b");
		b.doTest();
	}

}