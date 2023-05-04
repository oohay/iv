package example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *  Test suite
 */
public class May5Test {

	@Test
	public void testFoo() {
		assertEquals("foo", May5.foo());
	}

}
