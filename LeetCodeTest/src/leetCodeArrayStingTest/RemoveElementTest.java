package leetCodeArrayStingTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetCodeArraySting.RemoveElement;

class RemoveElementTest {

	@Test
	void test() {
		
		int[] nums = {1,2,3,3,4,4,2,5};
		int val = 2;
		
		RemoveElement remove = new RemoveElement();
		int returned = remove.RemoveArrayElement(nums, val);
		
		int expected = 6;
		assertEquals(expected, returned);
	}

}
