package com.bharath.trainings.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {
	private Greeting greeting;
	
	@Before
	public void setup(){
		greeting=new GreetingImpl();
	}

	@Test
	public void greetShouldReturnAValidOutput() {
		String result=greeting.greet("JUnit");
		assertNotNull(result);
		assertEquals("Hello JUnit",result);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_NameIsNull(){
		greeting.greet(null);
	}
	@Test(expected=IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_NameIsBlank(){
		greeting.greet("");
	}
	
	@After
	public void teardown(){
		greeting=null;
	}

}
