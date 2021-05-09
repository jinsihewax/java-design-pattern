package org.jsh.design.state.impl;

import org.jsh.design.state.A;
import org.jsh.design.state.Context;
import org.springframework.stereotype.Component;

@Component
public class C implements A {

	@Override
	public void doTest(Context context) {
		System.out.println("C");
		context.setState(this);
	}

	@Override
	public void start() {
		// 无此状态
	}

	@Override
	public void stop() {
		System.out.println("c stop");
	}

}
