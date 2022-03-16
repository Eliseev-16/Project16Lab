package testlr5;

import static org.junit.Assert.*;

import org.junit.Test;

import lr4.RandomForArray;

public class CheckRange {

	@Test
	public void test() {
		
		assertTrue(RandomForArray.generateRandom()>=100 && RandomForArray.generateRandom()<=7000);
	}

}
