package org.jsh.design.bridging;

import org.jsh.design.bridging.behavior.impl.GreenCircle;
import org.jsh.design.bridging.behavior.impl.RedCircle;
import org.jsh.design.bridging.use.Shape;
import org.jsh.design.bridging.use.impl.Circle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BridgingTest {

	@Test
	public void testBridging() {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}