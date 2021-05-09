package org.jsh.design.state.impl;

import org.jsh.design.state.A;
import org.jsh.design.state.Context;
import org.springframework.stereotype.Component;

@Component
public class B implements A {

	@Override
	public void doTest(Context context) {
		System.out.println("B");
		context.setState(this);
	}

	@Override
	public void start() {
		System.out.println("B start");
	}

	@Override
	public void stop() {
		// 该状态没有此操作
	}

}
