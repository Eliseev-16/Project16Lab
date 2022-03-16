package testlr5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lr4.SortArr;

public class SortTest {
	
	private static int [] arrNoSort;
	private static int [] arrSort;
	
	@BeforeClass
	public static void setUp() {
		arrNoSort = new int[] {9,8,7,6,5,4,3,2,1};
		arrSort = new int[] {1,2,3,4,5,6,7,8,9};
	}

	@Test
	public void test() {
		SortArr.sort(arrNoSort);
	}
	
	@AfterClass
	public static void endTest() {
		assertArrayEquals(arrNoSort,arrSort);
	}

}
