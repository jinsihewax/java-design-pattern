package org.jsh.design.state;

public interface A {

	public void doTest(Context context);
	
	/**
	 * spring 
	 * @param context
	 */
	public void start();
	
	/**
	 * spring 
	 * @param context
	 */
	public void stop();
}
