package com.java.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstCharacterOccuranceTest {

	FirstCharacterOccurance firstOccurance = new FirstCharacterOccurance();
	
	@Test
	public void ifEmptyStringReturnNull(){
		assertEquals(firstOccurance.firstRepeatedCharInAString(""),firstOccurance.EMPTY_STRING);
	}
	
	@Test
	public void ifNullStringReturnNull(){
		assertEquals(firstOccurance.firstRepeatedCharInAString(null),firstOccurance.EMPTY_STRING);
	}

	@Test
	public void ifSingleCharStringReturnSame(){
		assertEquals(firstOccurance.firstRepeatedCharInAString("A"),firstOccurance.EMPTY_STRING);
	}

	@Test
	public void ifMultiCharStringWithOneRepeatedReturnFirstRepeatingChar(){
		assertEquals(firstOccurance.firstRepeatedCharInAString("ABCDEA"),"A");
	}

	@Test
	public void ifMultiCharStringWithMoreThanOneRepeatedReturnFirstRepeatingChar(){
		assertEquals(firstOccurance.firstRepeatedCharInAString("ABCDBEA"),"B");
	}
	
	@Test
	public void ifMultiCharStringWithoutRepeatedReturnNull(){
		assertEquals(firstOccurance.firstRepeatedCharInAString("ABC"),firstOccurance.EMPTY_STRING);
	}

}
