package org.jsh.design.enjoy.yuan.factory;

import java.util.HashMap;
import java.util.Map;

import org.jsh.design.enjoy.yuan.impl.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Factory {

	@Autowired
	private final Map<String, B> tygs = new HashMap<String, B>();

	public B getTyg(String yundong) {
		// B tyg = tygs.get(yundong);
		// if (tyg == null) {
		// tyg = new B();
		// tygs.put(yundong, tyg);
		// }
		return tygs.get(yundong);
	}

	public int getSize() {
		return tygs.size();
	}
}
