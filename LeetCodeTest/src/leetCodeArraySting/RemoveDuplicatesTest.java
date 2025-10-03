package leetCodeArraySting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

	@Test
	void test() {
		int[] nums = {1,1,2};
		int nonDup = 2;
		
		RemoveDuplicates dups = new RemoveDuplicates();
		int returned = dups.RemoveDups(nums);
		
		assertEquals(nonDup, returned);
	}

}
