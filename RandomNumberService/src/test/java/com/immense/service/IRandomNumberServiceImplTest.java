package com.immense.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IRandomNumberServiceImplTest {

	IRandomNumberService service;

	@Before
	public void setUp() throws Exception {
		service = new IRandomNumberServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		service = null;
	}

	@Test
	public void test() {
		int firstNumber = service.generateRandomNumber();
		int secondNumber = service.generateRandomNumber();

		assertNotSame("Both numbers should be different", firstNumber, secondNumber);
	}

}
