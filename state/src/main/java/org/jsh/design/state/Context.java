package org.jsh.design.state;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Context {
	private A state;

	/**
	 * spring 使用方式 start
	 */
	@Autowired
	private final Map<String, A> tygs = new HashMap<String, A>();

	public void setSpringState(String a) {
		this.state = tygs.get(a);
	}

	/**
	 * spring 使用方式 start
	 */

	public Context() {
		state = null;
	}

	public void setState(A state) {
		this.state = state;
	}

	public A getState() {
		return state;
	}
}