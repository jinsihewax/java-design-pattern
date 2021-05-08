package org.jsh.design.enjoy.yuan.impl;

import org.jsh.design.enjoy.yuan.A;
import org.springframework.stereotype.Component;

@Component
public class B implements A {

	@Override
	public void doTest() {
		System.out.println("B");
	}

}
