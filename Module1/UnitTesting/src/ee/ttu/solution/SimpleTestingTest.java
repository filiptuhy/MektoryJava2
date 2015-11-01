package ee.ttu.solution;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class SimpleTestingTest {

	SimpleTesting simpleTesting;
	
	//Methods marked with the @Before annotation
	//are run before each test
	//They can be used to initialize stuff
	@Before
	public void setUp(){
		simpleTesting = new SimpleTesting();
	}
	
	@Test
	public void testGetIntegerFromString() {
		int actualResult = simpleTesting.getIntegerFromString("42");
		int expectedResult = 42;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testGetContentFromFile(){
		String actualContent = simpleTesting.getContentFromFile(new File("testFile.txt"));
		String expectedContent = "Hello!";
		
		assertEquals(expectedContent, actualContent);
	}
	
	@Test
	public void testGetRandomNumber(){
		int firstResult = simpleTesting.getRandomNumber();
		int secondResult = simpleTesting.getRandomNumber();
		
		assertNotEquals("Random calls should yield different results!",firstResult, secondResult);
	}

}
