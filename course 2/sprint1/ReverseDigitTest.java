package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseDigitTest {

	ReverseDigit rd ;
    @Before
    public void setUp() {
		rd = new ReverseDigit();

    }
    @After
    public void tearDown() {
		rd=null;

    }
	int number = 35678;
	@Test
	public void givenInputPositiveNumberReverseTheDigit(){
		
		int actualResult= rd.getReverse(number);
		assertEquals(87653,actualResult);
	}
	@Test
	public void givenInputNegativeNumberReverseTheDigit(){
		int actualResult= rd.getReverse(-35678);
		assertEquals(-87653,actualResult);

	}


}