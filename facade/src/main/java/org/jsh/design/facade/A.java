package org.jsh.design.facade;

import org.jsh.design.facade.impl.B;
import org.jsh.design.facade.impl.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	@Autowired
	private B b;

	@Autowired
	private C c;

	public void doTest() {
		System.out.println("A");
		b.doTest();
		c.doTest();
	}
}
