package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhLevelAnalyserTest {
    PhLevelAnalyser pa;
    @Before
    public void setUp()  {
		pa = new PhLevelAnalyser();
    }

   

	@Test
	public void getPhvalueOfWaterForInputPhSix(){
		String actualResult = pa.getPhValueOfWater(6);
		assertEquals("pH value is low, partial water change required",actualResult);
	}

	@Test
	public void getPhValueofWaterForInputPhEight(){
		String actualResult = pa.getPhValueOfWater(8);
		assertEquals("pH value is fine", pa.getPhValueOfWater(8));
	}
	@Test
	public void getPhValueofWaterForInputPhten(){
		String actualResult = pa.getPhValueOfWater(10);
		assertEquals("pH value is high, partial water change required",actualResult);
	}
		
		 @After
    public void tearDown()  {
		pa=null;
    
	}
}
