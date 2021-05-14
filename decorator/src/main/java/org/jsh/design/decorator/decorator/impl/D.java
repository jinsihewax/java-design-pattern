package org.jsh.design.decorator.decorator.impl;

import org.jsh.design.decorator.A;
import org.jsh.design.decorator.decorator.ADecorator;
import org.springframework.stereotype.Component;

@Component
public class D extends ADecorator {

	// @Autowired
	// public D(A decoratedShape) {
	// super(decoratedShape);
	// }

	@Override
	public void doTest() {
		a.doTest();
		setRedBorder(a);
	}

	private void setRedBorder(A decoratedShape) {
		System.out.println("装饰新增方法----");
	}
}
