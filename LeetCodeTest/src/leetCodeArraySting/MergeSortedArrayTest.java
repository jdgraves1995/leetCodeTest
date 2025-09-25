package leetCodeArraySting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

	@Test
	void test() {
		
		int[] nums1 = {-1,0,0,3,3,3,0,0,0};
		int[] nums2 = {1,2,2};
		
		int m = 6;
		int n = 3;
		
		MergeSortedArray sorted = new MergeSortedArray();
		sorted.merge(nums1, m, nums2, n);
		
		int[] expected = {-1,0,0,1,2,2,3,3,3};
		assertArrayEquals(expected,nums1);

		System.out.println(Arrays.toString(nums1));
	}

}
