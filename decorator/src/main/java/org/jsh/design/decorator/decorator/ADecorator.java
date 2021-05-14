package org.jsh.design.decorator.decorator;

import org.jsh.design.decorator.A;

public abstract class ADecorator implements A {
	protected A a;

	// public ADecorator(A decoratedShape) {
	// this.a = decoratedShape;
	// }

	public void set(A a) {
		this.a = a;
	}

	public void draw() {
		a.doTest();
	}
}
