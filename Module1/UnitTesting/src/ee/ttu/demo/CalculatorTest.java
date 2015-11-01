package ee.ttu.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ee.ttu.solution.SimpleTesting;

public class CalculatorTest {
	Calculator calc ;

	@Before
	public void setUp(){
		 calc = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int num1 = 5;
		int num2 = 10;
		
		int result = calc.add(num1, num2);
		int correctAnswer = 15;
		assertEquals(correctAnswer, result);
	}
	
	@Test
	public void testSub(){
		int num1 = 5;
		int num2 = 10;
		
		int result = calc.sub(num1, num2);
		int correctAnswer = -5;
		assertEquals(correctAnswer, result);
	}
	
	@Test(expected = Exception.class)  
	public void testDivisionByZero(){
		int num1 = 10;
		int zero = 0;
		
		calc.div(num1,zero);
	}

}
