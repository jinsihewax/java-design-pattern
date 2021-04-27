package org.jsh.design.factory.impl;

import org.jsh.design.factory.A;
import org.springframework.stereotype.Component;

@Component
public class B implements A {

	public void doTest() {
		System.out.println("B");
	}

}
