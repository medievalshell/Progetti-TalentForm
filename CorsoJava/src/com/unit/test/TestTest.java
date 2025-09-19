package com.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTest {

	@Test
	void testRuturnNull() {
		//fail("Not yet implemented");
		String s = null;
		assertNull(s);
	}
	@Test
	void TestMultipleAssertions() {
		int a = 5;
		int b = 10;
		assertAll(()-> assertTrue(a<b), ()-> assertEquals(15, a+b));
	}
	@Test
	void TestUpperCase() {
		assertEquals("BENVENUTO", "BENVENUTO".toUpperCase());
	}

}
