package org.jsh.design.state;

import org.jsh.design.state.impl.B;
import org.jsh.design.state.impl.C;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class StateTest {

	@Autowired
	private Context context;

	@Test
	public void testSpringState() {
		context.setSpringState("b");
		context.getState().start();

		context.setSpringState("c");
		context.getState().stop();

		System.out.println("++++++++++++++");
		context.getState().start();
		System.out.println("-----------------");
	}

	@Test
	public void testState() {
		Context context = new Context();

		A startState = new B();
		startState.doTest(context);

		System.out.println(context.getState().toString());

		A stopState = new C();
		stopState.doTest(context);

		System.out.println(context.getState().toString());
	}

}