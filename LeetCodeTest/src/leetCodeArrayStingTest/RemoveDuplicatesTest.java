package leetCodeArrayStingTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetCodeArraySting.RemoveDuplicates;

class RemoveDuplicatesTest {

	@Test
	void test() {
		int[] nums = {1,1,2};
		int nonDup = 2;
		
		RemoveDuplicates dups = new RemoveDuplicates();
		int returned = dups.RemoveDups(nums);
		
		assertEquals(nonDup, returned);
	}

	
	@Test
	void test2() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int nonDup = 5;
		
		RemoveDuplicates dups = new RemoveDuplicates();
		int returned = dups.RemoveDups(nums);
		
		assertEquals(nonDup, returned);
	}
}
