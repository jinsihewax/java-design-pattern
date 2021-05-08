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

	@Test
	public void testCloneObject() throws CloneNotSupportedException {
		// 使用一个对象
		B b = a.getTyg("b");
		B b1 = b.clone();
		System.out.println("b:" + System.identityHashCode(b));
		System.out.println("old-b:" + System.identityHashCode(b));
		System.out.println("b1:" + System.identityHashCode(b1));
		
		//普通new 性能比clone快
		//稍微复杂构造方法，new性能比clone差太多。
	}

}