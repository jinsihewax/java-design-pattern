package org.jsh.design.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class FactoryTest {

	@Autowired
	private AFactory factory;

	@Test
	public void testFactory() {
		factory.getA("b");
	}

}