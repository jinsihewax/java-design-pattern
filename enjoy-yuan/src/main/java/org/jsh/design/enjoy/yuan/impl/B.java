package org.jsh.design.enjoy.yuan.impl;

import org.jsh.design.enjoy.yuan.A;
import org.springframework.stereotype.Component;
// 享元模式
//@Component
//public class B implements A {
//
//	@Override
//	public void doTest() {
//		System.out.println("B");
//	}
//
//}

//享元模式+深克隆 
@Component
public class B implements A, Cloneable {

	@Override
	public void doTest() {
		System.out.println("B");
	}

	@Override
	public B clone() throws CloneNotSupportedException {
		return (B) super.clone();
	}
}
