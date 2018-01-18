package testlogic;

import static org.junit.Assert.*;
import logic.Calculation;

import org.junit.Test;

public class TestLogic {

	@Test
	public void FindMaxTest() {
		assertEquals(4, Calculation.FindMax(new int[] { 1, 3, 4, 2 }));
	}// FindMaxTest
}// class
