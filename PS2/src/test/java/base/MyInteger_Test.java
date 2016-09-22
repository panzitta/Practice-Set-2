package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//Main concern 
	@Test
	public void test() {
		assertTrue(1==1);
	}
	@Test 
	public void testIsEvenTrue(){
		int testValue=2;
		MyInteger instance = new MyInteger(testValue);
		assertTrue(instance.isEven());
	}
	@Test
	public void testIsEvenFalse(){
		int testValue=3;
		MyInteger instance = new MyInteger(testValue);
		assertFalse(instance.isEven());
	}
	@Test 
	public void testIsOddFalse(){
		int testValue = 24;
		MyInteger instance = new MyInteger(testValue);
		assertFalse(instance.isOdd());
	}
	
	@Test 
	public void testIsOddTrue(){
		int testValue = 27;
		MyInteger instance = new MyInteger(testValue);
		assertTrue(instance.isOdd());
	}
	
	@Test
	public void testIsPrimeTrue(){
		int testValue=13;
		MyInteger instance = new MyInteger(testValue);
		assertTrue(instance.isPrime());
	}
	
	@Test
	public void testIsPrimeFalse(){
		int testValue=20;
		MyInteger instance = new MyInteger(testValue);
		assertFalse(instance.isPrime());
	}
	@Test
	public void testEqualsTrue(){
		int test = 12;
		MyInteger instance = new MyInteger (test);
		assertTrue(instance.equals(test));
	}

}