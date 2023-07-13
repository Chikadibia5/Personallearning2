package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumUnits {


	public void test() {
		UnitTesting obj1=new UnitTesting();
		int output_f = obj1.sum (4,1);
		//Test the output
		assertEquals(0,output_f);
		
	}

}
