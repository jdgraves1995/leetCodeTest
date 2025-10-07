package leetCodeArraySting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesIITest {

	@Test
	void test1() {
		int[] nums = {1,2,2};
		int nonDup = 3;
		
		RemoveDuplicatesII dups = new RemoveDuplicatesII();
		int returned = dups.removeDuplicatesAgain(nums);
		
		assertEquals(nonDup, returned);
	}

}
