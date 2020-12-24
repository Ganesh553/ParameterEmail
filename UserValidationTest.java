package com.Junit;

import static org.junit.Assert.*;

import java.util.Scanner;

import javax.management.InvalidAttributeValueException;

import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(Parameterized )
public class UserValidationTest  {

	@Test
	public void testFirstName()  {
		UserValidation test = new UserValidation();
		boolean fname = test.validateFirstName("Gane");
		assertEquals(true, fname);
	}
	
	@Test
	public void testLastName()  {
		UserValidation test = new UserValidation();
		boolean lname = test.validateLastName("Kum");
		assertEquals(true, lname);
	}
	
	@Test
	public void testEmail()  {
		UserValidation test = new UserValidation();
		boolean email = test.validateEmailAddress("abc@gmail.com");
		assertEquals(true, email);
	}
	
	@Test
	public void testPassword()  {
		UserValidation test = new UserValidation();
		boolean password = test.validatePassword("Acad@12&scc");
		assertEquals(true, password);
	}
	
	@Test
	public void testPhoneNumber()  {
		UserValidation test = new UserValidation();
		boolean phoneNo = test.validatePhoneNumber("91-7123456789");
		assertEquals(true, phoneNo);
	}

}
