package ProgrammingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConJunit {
	

	@Test
	public void test() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.concat("Hello", "World");
		assertEquals("HelloWorld", result);
		//fail("Not yet implemented");
	}

}
