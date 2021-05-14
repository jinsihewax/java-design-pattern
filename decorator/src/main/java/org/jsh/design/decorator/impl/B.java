package org.jsh.design.decorator.impl;

import org.jsh.design.decorator.A;
import org.springframework.stereotype.Component;

@Component
public class B implements A {

	public void doTest() {
		System.out.println("B");
	}

}
