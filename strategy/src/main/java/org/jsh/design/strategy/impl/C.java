package org.jsh.design.strategy.impl;

import org.jsh.design.strategy.A;
import org.springframework.stereotype.Service;

@Service
public class C implements A {

	@Override
	public void doTest() {
		System.out.println("C");
	}

}
