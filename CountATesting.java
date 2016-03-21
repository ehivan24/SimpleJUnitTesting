import static org.junit.Assert.*;

import org.junit.Test;

public class CountATesting {
	/**
	 * Single unit test for method
	 * Checks or asserts for the value
	 *  	
	 */
	
	
	@Test
	public void test() {
		JunitTest jtesting = new JunitTest();
		int output = jtesting.countA("alphabeta");
		assertEquals(3, output);
	}
}
