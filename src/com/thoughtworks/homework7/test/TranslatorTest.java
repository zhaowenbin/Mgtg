package com.thoughtworks.homework7.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thoughtworks.homework7.util.Translator;

public class TranslatorTest {

	@Test
	public void testRomanToArabic() {
		//fail("Not yet implemented");
		assertEquals(1903, Translator.romanToArabic("MCMIII"));
	}

}
