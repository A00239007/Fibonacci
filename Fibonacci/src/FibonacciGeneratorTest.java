import java.io.EOFException;

import junit.framework.TestCase;


public class FibonacciGeneratorTest extends TestCase {
	//Test: 001
	//Objective: Testing if the value inputed is greater than 0
	//Input(s): 1
	//Output(s): 1
	
	public void testFibonacciGenerator001()
	{
		FibonacciGenerator testObj = new FibonacciGenerator();
		try
		{
			assertEquals(true,testObj.validateN(1));
		}
		catch(Exception e)
		{
			fail("The value was not greater than 0");
		}
	}
	//Test: 002
	//Objective: Testing if the value inputed is less than 0
	//Input(s): -1
	//Output(s): Exception
	
	public void testFibonacciGenerator002()
	{
		FibonacciGenerator testObj = new FibonacciGenerator();
		try
		{
			assertEquals(true, testObj.validateN(-1));
			fail("Exception was not thrown");
		}
		catch(Exception e)
		{
			assertEquals("The value was less that 0",e.getMessage());
		}
	}
	//Test: 003
	//Objective: Testing if the values are calculated
	//Input(s): 5
	//Output(s): 5
	
	public void mytestFibonacciGenerator003()
	{
		FibonacciGenerator testObj = new FibonacciGenerator();
		try
		{
			assertEquals(5,testObj.calculateNthValue(5));
		}
		catch(Exception e)
		{
			fail("Error in code");
		}
	}
	
	//Test: 004
	//Objective: Testing if the value inputed is a string
	//Input(s): g
	//Output(s): Exception
	
	public void testFibonacciGenerator004()
	{
		FibonacciGenerator testObj = new FibonacciGenerator()
		try
		{
			
		}
	}
	
	//Test:
	//Objective:
	//Input(s):
	//Output(s):
	
	//Test:
	//Objective:
	//Input(s):
	//Output(s):
	
	//Test:
	//Objective:
	//Input(s):
	//Output(s):
	
	//Test:
	//Objective:
	//Input(s):
	//Output(s):
}
