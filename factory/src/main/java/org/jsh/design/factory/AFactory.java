package org.jsh.design.factory;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AFactory {

	@Autowired
	private Map<String, A> aMap;

	@SuppressWarnings("unused")
	@Autowired
	private List<A> aList;

	public A getA(String aType) {
		A bean1 = aMap.get(aType);
		System.out.println(bean1);
		return bean1;
	}
}
