package com.bharath.trainings.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WelcomeImplTest {
	private Welcome welcome;
	
	@Before
	public void setup(){
		welcome=new WelcomeImpl();
	}

	@Test
	public void welcomeShouldReturnAValidOutput() {
		String result=welcome.welcome("Nitin");
		assertNotNull(result);
		assertEquals("Welcome Nitin",result);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void welcomeShouldThrowAnException(){
		welcome.welcome(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void welcomeShouldThrowAnExceptionForBlank(){
		welcome.welcome("");
	}
	
	public void teardown(){
		welcome=null;
	}

}
