package com.equifax.fizzBuzz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzBuzzApplicationTests {
	FizzBuzzApplication fizzBuzzApplication = new FizzBuzzApplication();

	@Test
	public void fizzBuzzDivisbileBy3() {
		Assert.assertEquals("Fizz", fizzBuzzApplication.calculateFizzBuzz(3));
	}

	@Test
	public void fizzBuzzDivisbileBy5() {
		Assert.assertEquals("Buzz", fizzBuzzApplication.calculateFizzBuzz(5));
	}

	@Test
	public void fizzBuzzDivisbileBy3And5() {
		Assert.assertEquals("FizzBuzz", fizzBuzzApplication.calculateFizzBuzz(15));
	}

	@Test
	public void fizzBuzzNotVisbleBy3or5() {
		Assert.assertNull("Number is not divisble by 3 or 5", fizzBuzzApplication.calculateFizzBuzz(29));
	}
}
