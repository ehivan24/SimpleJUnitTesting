import static org.junit.Assert.*;

import org.junit.Test;

public class TesingJunit {

	/**
	 * Single unit test for method
	 * Checks or asserts for the value
	 *  	
	 */
	
	@Test
	public void test() {
		JunitTest test = new JunitTest();
		int output = test.squareIt(5);
		assertEquals(25, output);
	}
}
