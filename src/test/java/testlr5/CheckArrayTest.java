package testlr5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import lr4.CreateArray;

public class CheckArrayTest {
	private static int [] arr2;
	
	@BeforeClass
	public static void setUp() {
		CreateArray createArray = new CreateArray();
		arr2 = createArray.getArray();
	}

	@Test
	public void test() {
		assertEquals(arr2.length, 9);
		for(int i = 0; i<9; i++) {
			assertNotNull(arr2[i]);
		}
	}

}
