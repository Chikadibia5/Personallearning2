package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestTest {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_f=obj1.square(4);
		//Test the out put
		assertEquals(16,output_f);
		
		
	}

}
