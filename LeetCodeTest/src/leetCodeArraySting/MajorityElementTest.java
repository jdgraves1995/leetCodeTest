package leetCodeArraySting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MajorityElementTest {

	@Test
	void test() {
		
		int[] nums = {2,2,1,1,1,2,2};
		int val = 2;
		
		MajorityElement majority = new MajorityElement();
		int returned = majority.majorityElementReturn(nums);
		
		assertEquals(val, returned);
	}

}
