package org.jsh.design.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class StrategyTest {

	// spring 中的策略模式直接，注入
	@Autowired
	private Map<String, A> as = new ConcurrentHashMap<>(3);

	// spring 中的策略模式直接，注入
	@Autowired
	private List<A> ls = new ArrayList<A>();

	@Test
	public void testStrategy() {
		System.out.println("as:" + as);
		System.out.println("as:" + ls.size());
	}

}